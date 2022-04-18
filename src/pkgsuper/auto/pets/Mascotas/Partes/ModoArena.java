package pkgsuper.auto.pets.Mascotas.Partes;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModoArena {

    public int round = 1;
    private Jugador jugador1;
    private Jugador jugador2;
    private Tienda tienda;
    private Reportes reporte;
    private String ganador;
    private String log = "";
    int animalesUsados = 2;
    
    boolean cupoLleno = false;

    public ModoArena(Jugador jugador) {
        this.jugador1 = jugador; //traemos el jugador creado a inicio de partida
        this.reporte = new Reportes();
        jugador.setAnimalActual(0);
        this.jugador2 = new Jugador(); // iniciamos otro jugador como inteligencia artificial
        this.tienda = new Tienda(jugador, jugador2); //iniciamoso la tienda de la partida con el jugador creado a inicios de la partida
        IngresoIA(jugador);//creamos la inteligencia artificial y llenamos su arreglo de animales
        jugarRonda(jugador, jugador2, false);
    }

    public ModoArena(Jugador jugador, Jugador jugador2) {
        this.jugador1 = jugador; //traemos el jugador creado a inicio de partida
        this.jugador2 = new Jugador(); //Creamos al jugador 2 creado a inicio de partida
        this.reporte = new Reportes();
        jugador.setAnimalActual(0);
        jugador2.setAnimalActual(0);
        this.tienda = new Tienda(jugador, jugador2);
        jugarRonda(jugador, jugador2, true);
    }

    //se crea el bucle de comprar-pelear turno jugador- pelear turno IA - evaluar vidas - tienda
    //necesitamos un jugador y la inteligencia artificial creada
    private void jugarRonda(Jugador jugador, Jugador jugador2, boolean IsVersus) {

        while (jugador.getAnimalActual() < 10 & jugador2.getAnimalActual() < 10) {
            if (IsVersus) {
                //mode versus
                log = "\n\n---->Turno de " + jugador.Nombre + "\n";
                escogerAnimal(jugador);
                log += "\n\n---->Turno de " + jugador2.Nombre + "\n";
                escogerAnimal(jugador2);
            }
            if (!IsVersus) {
                //modo arena
                escogerAnimal(jugador); //tienda al inicio de cada ronda
            }
            log = "\n\n---->Turno de " + jugador.Nombre + "\n";
            pelear(jugador, jugador2);
            log += "\n\n---->Turno de " + jugador2.Nombre + "\n";
            pelear(jugador2, jugador);
            round++;
            jugador.setOro(jugador.getOro() + 5);//se añadira oro al jugador al finalizar cada ronda
            jugador2.setOro(jugador.getOro() + 5);//se añadira oro al jugador al finalizar cada ronda
            //souts que pueden servir para los reportes
            log += "\n\nVida de " + jugador.Nombre + ": " + jugador.getVida();
            log += "\nAnimales disponibles: " + (10 - jugador.getAnimalActual()) + "\t\tOro: " + jugador.getOro();
            log += "\n\nVida de " + jugador2.Nombre + ": " + jugador2.getVida() + "\n\n\n";
            System.out.println(log);
            reporte.setLog(log);
            log = "";
        }
        try {
            log += ganador;
            System.out.println(ganador);
            reporte.setLog(log);
            jugador.setAnimalesUsados(animalesUsados);
            reporte.DatosFinalesXPartida(jugador.getOroGastado(), jugador.TotalDañoRecibido, jugador.TotalDañoRealizado,jugador.getAnimalesUsados());
            jugador.setOroGastado(0);
            jugador.TotalDañoRecibido=0;
            jugador.TotalDañoRealizado=0;
            jugador.setAnimalesUsados(0);
            reporte.guardarLogBatalla();
            jugador.ReiniciarDatos();
        } catch (IOException ex) {
            Logger.getLogger(ModoArena.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //clase para crear equipo de inteligencia artificial
    private final void IngresoIA(Jugador jugador) {
        for (int i = 0; i < 10; i++) {
            //nos dira el slot del equipo, mientras mas grande entre el 1 y 10 sea, mas dificultad tendra el animal
            tienda.CompraAnimal(jugador, i, true, reporte);

        }
        System.out.println("-------- Animales de la IA");
        jugador2.MostrarDatos();
        System.out.println("---------- Terminan animales de la IA\n\n\n\n");
    }

    private void pelear(Jugador jugador1, Jugador jugador2) {
        //jugador 1 es el jugador atacante y jugador 2 es el jugador atacado
        log += jugador1.atacar(jugador1.getAnimalActual(), jugador2.getAnimalActual(), jugador2);
        //el animal actual es el animal por el cual van en orden de batalla

        if (jugador2.EquipoJ1[jugador2.getAnimalActual()].getVida() <= 0) {
            //sout que puede servir para los reportes
            String victoria = "\n\n-X Se derroto al animal " + (jugador2.getAnimalActual()) + " de " + jugador2.Nombre + ": " + jugador2.EquipoJ1[jugador2.getAnimalActual()].getAnimal();
            //System.out.println(victoria);
            log += victoria;
            jugador2.setVida(jugador2.getVida() - 1);
            jugador2.setAnimalActual(jugador2.getAnimalActual() + 1);
            if (jugador1.getAnimalActual() < 10 && jugador2.getAnimalActual() < 10) {
                String cambio = "\n\t-> entrara " + jugador2.EquipoJ1[jugador2.getAnimalActual()].getAnimal();
                animalesUsados +=1;
                //System.out.println(cambio);
                log += cambio;
            } else {
                ganador = "\n\n\t\t\t----------------\n\t\tEl ganador es: " + jugador1.Nombre + "\n\t\t\t----------------\n";
            }
        }
    }

    private void escogerAnimal(Jugador jugador) {
        
        if (round <= 1) {
            for (int i = 0; i < 3; i++) { //para que en la ronda 1 se escogan 3 animales a la vez
                System.out.println("\n" + jugador.Nombre + " Selecciona tu animal nº" + (i + 1)+
                        "\n-----------------------------------");
                tienda.ImprimirTienda(jugador, round, reporte);
            }
        } else if ((jugador1.index < 10 || jugador2.index < 10) & round > 1) { //luego de la ronda 1 se entrara a la tienda al ifnalizar cada ronda
            System.out.println("\n\n\n\n\t\t ----- TIENDA " + jugador.Nombre);
            tienda.ImprimirTienda(jugador, round, reporte);
            System.out.println("\n\n\n\n\n\n\n");
        }else if(!cupoLleno){
            System.out.println("---Jugador "+ jugador.Nombre + " ya tiene sus 10 animales :) ---");
            cupoLleno = true;
        }

        reporte.setLog(log);
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log += log;
    }

}
