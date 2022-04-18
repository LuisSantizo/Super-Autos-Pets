package pkgsuper.auto.pets.Mascotas.Partes;

import pkgsuper.auto.pets.Mascotas.Mascotas;

public class Jugador {

    String Nombre;
    int Oro = 10;
    int Vida = 10;
    Mascotas[] EquipoJ1 = new Mascotas[10];
    int index = 0;
    int animalActual = 0;
    int OroGastado;
    int TotalDañoRecibido, TotalDañoRealizado, AnimalesUsados;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;
    }

    public Jugador() {
        this.Nombre = "Jugador AI";
    }

    public void AnadirAnimal(Mascotas IngresoAnimal) {
        if (index >= 0 & index < 10) {
            EquipoJ1[index] = IngresoAnimal;
            index++;
        }
    }

    public void MostrarDatos() {
        for (int i = 0; i < index; i++) {
            if (EquipoJ1[i] != null) {
                System.out.println(EquipoJ1[i].toString());
            }
        }
    }

    //clase para atacar
    public String atacar(int animalAtacante, int animalAtacado, Jugador atacado) {
        String logString = "";
        if (animalAtacado != 10 && animalAtacante != 10) {
            int Ataque = EquipoJ1[animalAtacante].getAtaque();
            int salud = atacado.EquipoJ1[animalAtacado].getVida();

            logString += "-El jugador " + this.Nombre + " ataca con " + EquipoJ1[animalAtacante].getAnimal() + " al " + atacado.EquipoJ1[animalAtacado].getAnimal() + " de " + atacado.Nombre;
            logString += "\n-" + EquipoJ1[animalAtacante].getAnimal() + "hace " + Ataque + " de daño a " + atacado.EquipoJ1[animalAtacado].getAnimal() + " con salud de  " + salud;
            atacado.EquipoJ1[animalAtacado].setVida(salud - Ataque);
            TotalDañoRealizado += +Ataque;
            TotalDañoRecibido += +atacado.EquipoJ1[animalAtacado].getAtaque();
            logString += "\n-Dejando al  " + atacado.EquipoJ1[animalAtacado].getAnimal() + " de " + atacado.Nombre + " con salud de " + atacado.EquipoJ1[animalAtacado].getVida() + " por daño del " + EquipoJ1[animalAtacante].getAnimal() + " de " + this.Nombre;
        }
        //System.out.println(logString);

        return logString;
    }

    public int getOro() {
        return Oro;
    }

    public void setOro(int Oro) {
        this.Oro = Oro;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getAnimalActual() {
        return animalActual;
    }

    public void setAnimalActual(int animalActual) {
        this.animalActual = animalActual;
    }

    public void ReiniciarDatos() {
        this.Oro = 10;
        this.Vida = 10;
        this.index = 0;
        this.animalActual = 0;
    }

    public int getOroGastado() {
        return OroGastado;
    }

    public void setOroGastado(int OroGastado) {
        this.OroGastado = OroGastado;
    }

    public int getAnimalesUsados() {
        return AnimalesUsados;
    }

    public void setAnimalesUsados(int AnimalesUsados) {
        this.AnimalesUsados = AnimalesUsados;
    }

}
