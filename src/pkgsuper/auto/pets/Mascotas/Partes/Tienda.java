package pkgsuper.auto.pets.Mascotas.Partes;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import pkgsuper.auto.pets.Mascotas.Mascotas;
import pkgsuper.auto.pets.Mascotas.Tipos.*;

public class Tienda {
    
    Scanner Opcion = new Scanner(System.in);
    Jugador Jugad;
    Jugador inteligenciaArtificial;
    
    private int CantidadMaxima = 3;
    String[] NombreAnimal = {"Hormiga", "Pescado", "Mosquito", "Grillo", "Castor", "Caballo", "Nutria", "Escarabajo",
        "Sapo", "Dodo", "Elefante", "Puerco_Espin", "Pavoreal", "Rata", "Zorro", "Zorro",
        "Camello", "Mapache", "Jirafa", "Tortuga", "Caracol", "Oveja", "Conejo", "Lobo", "Buey", "Canguro", "Buho",
        "Venado", "Loro", "Hipopótamo", "Delfín", "Puma", "Ballena", "Ardilla", "Llama",
        "Foca", "Jaguar", "Escorpión", "Rinoceronte", "Mono", "Cocodrilo", "Vaca", "Chompipe",
        "Panda", "Gato", "Tigre", "Serpiente", "Mamut", "Leopardo", "Gorila", "Pulpo", "Mosca",
        "Quetzal", "Quetzal"};
    
    public Tienda(Jugador Jugad, Jugador inteligenciaArtificial) {
        this.Jugad = Jugad;
        this.inteligenciaArtificial = inteligenciaArtificial;
        // InteligenciaArtificial = new Jugador("IA");

    }
    
    public void ImprimirTienda(Jugador jugador, int RondaActual, Reportes reporte) {
        //Se encuentra el numero de animales a mostrar
        ObtenerCantidadMax(RondaActual, reporte);
        //Se muestran los animales segun su Tier
        MostrarAnimalesRandom(jugador, RondaActual, reporte);
        
    }
    
    public void ObtenerCantidadMax(int RondaActual, Reportes reporte) {
        if (RondaActual == 1 || RondaActual == 2 || RondaActual == 3) {
            this.CantidadMaxima = 3;
        }
        if (RondaActual == 4 || RondaActual == 5 || RondaActual == 6) {
            this.CantidadMaxima = 4;
        }
        if (RondaActual >= 7) {
            this.CantidadMaxima = 5;
        }
    }
    
    public void MostrarAnimalesRandom(Jugador jugador, int RondaActual, Reportes reporte) {
        int AzarAnimal1 = 0;
        int AzarAnimal2 = 0;
        int AzarAnimal3 = 0;
        int AzarAnimal4 = 0;
        int AzarAnimal5 = 0;
        Random RanBot = new Random();
        
        if (this.CantidadMaxima == 3) {
            if (RondaActual == 1) {
                AzarAnimal1 = RanBot.nextInt(7);
                AzarAnimal2 = RanBot.nextInt(7);
                AzarAnimal3 = RanBot.nextInt(7);
            }
            if (RondaActual == 2 || RondaActual == 3) {
                AzarAnimal1 = RanBot.nextInt(8) + 7;
                AzarAnimal2 = RanBot.nextInt(8) + 7;
                AzarAnimal3 = RanBot.nextInt(8) + 7;
            }
            System.out.println("1)" + NombreAnimal[AzarAnimal1]);
            System.out.println("2)" + NombreAnimal[AzarAnimal2]);
            System.out.println("3)" + NombreAnimal[AzarAnimal3]);
        }
        if (this.CantidadMaxima == 4) {
            if (RondaActual == 4 || RondaActual == 5) {
                AzarAnimal1 = RanBot.nextInt(10) + 16;
                AzarAnimal2 = RanBot.nextInt(10) + 16;
                AzarAnimal3 = RanBot.nextInt(10) + 16;
                AzarAnimal4 = RanBot.nextInt(10) + 16;
            }
            if (RondaActual == 6) {
                AzarAnimal1 = RanBot.nextInt(7) + 27;
                AzarAnimal2 = RanBot.nextInt(7) + 27;
                AzarAnimal3 = RanBot.nextInt(7) + 27;
                AzarAnimal4 = RanBot.nextInt(7) + 27;
            }
            System.out.println("1)" + NombreAnimal[AzarAnimal1]);
            System.out.println("2)" + NombreAnimal[AzarAnimal2]);
            System.out.println("3)" + NombreAnimal[AzarAnimal3]);
            System.out.println("4)" + NombreAnimal[AzarAnimal4]);
        }
        if (this.CantidadMaxima == 5) {
            if (RondaActual == 7) {
                AzarAnimal1 = RanBot.nextInt(7) + 35;
                AzarAnimal2 = RanBot.nextInt(7) + 35;
                AzarAnimal3 = RanBot.nextInt(7) + 35;
                AzarAnimal4 = RanBot.nextInt(7) + 35;
                AzarAnimal5 = RanBot.nextInt(7) + 35;
            }
            if (RondaActual == 8 || RondaActual == 9) {
                AzarAnimal1 = RanBot.nextInt(7) + 40;
                AzarAnimal2 = RanBot.nextInt(7) + 40;
                AzarAnimal3 = RanBot.nextInt(7) + 40;
                AzarAnimal4 = RanBot.nextInt(7) + 40;
                AzarAnimal5 = RanBot.nextInt(7) + 40;
            }
            if (RondaActual == 10 || RondaActual == 11) {
                AzarAnimal1 = RanBot.nextInt(9) + 43;
                AzarAnimal2 = RanBot.nextInt(9) + 43;
                AzarAnimal3 = RanBot.nextInt(9) + 43;
                AzarAnimal4 = RanBot.nextInt(9) + 43;
                AzarAnimal5 = RanBot.nextInt(9) + 43;
            }
            if (RondaActual >= 12) {
                AzarAnimal1 = RanBot.nextInt(11) + 43;
                AzarAnimal2 = RanBot.nextInt(11) + 43;
                AzarAnimal3 = RanBot.nextInt(11) + 43;
                AzarAnimal4 = RanBot.nextInt(11) + 43;
                AzarAnimal5 = RanBot.nextInt(11) + 43;
            }
            System.out.println("1)" + NombreAnimal[AzarAnimal1]);
            System.out.println("2)" + NombreAnimal[AzarAnimal2]);
            System.out.println("3)" + NombreAnimal[AzarAnimal3]);
            System.out.println("4)" + NombreAnimal[AzarAnimal4]);
            System.out.println("5)" + NombreAnimal[AzarAnimal5]);
        }
        IngresarEleccionAnimal(jugador, this.CantidadMaxima, AzarAnimal1, AzarAnimal2, AzarAnimal3, AzarAnimal4, AzarAnimal5, reporte);
    }
    
    public void IngresarEleccionAnimal(Jugador jugador, int CantidadMaxima, int NumA1, int NumA2, int NumA3, int NumA4, int NumA5, Reportes reporte) {
        int OpElejida = 0;
        int OpAnimal = 0;
        
        System.out.println("ingrese una opcion:");
        boolean salir = false;
        //Comprobar si si la eleccion es posible

        while (!salir) {
            try {
                OpElejida = Opcion.nextInt();
                if (OpElejida == 1) {
                    OpAnimal = NumA1;
                    salir = true;
                } else if (OpElejida == 2) {
                    OpAnimal = NumA2;
                    salir = true;
                } else if (OpElejida == 3) {
                    OpAnimal = NumA3;
                    salir = true;
                } else if (OpElejida == 4 & (CantidadMaxima == 4 || CantidadMaxima == 5)) {
                    OpAnimal = NumA4;
                    salir = true;
                } else if (OpElejida == 5 & (CantidadMaxima == 5)) {
                    OpAnimal = NumA5;
                    salir = true;
                } else {
                    System.out.println("No se encobtro opcion");
                }
            } catch (InputMismatchException e) {
                System.out.println("debe ser un numero\n");
                Opcion.next();
            }
        }
        if (jugador.getOro() >= 3) {
            CompraAnimal(jugador, OpAnimal, false, reporte);
            System.out.println("Compro " + NombreAnimal[OpAnimal]);
            jugador.setOro(jugador.getOro() - 3);
            jugador.setOroGastado(jugador.getOroGastado() + 3);
            
        } else {
            System.out.println("No cuenta con oro suficiente");
        }
    }
    
    public void CompraAnimal(Jugador jugador, int OpAnimal, boolean isIA, Reportes reporte) {
        Mascotas animal;
        
        if (isIA) {
            OpAnimal = tierAnimal(OpAnimal);
        }
        
        switch (OpAnimal) {
            //Tier 1
            case 0:
                animal = new Mascotas("Hormiga", 2, 1, 1, new Insecto("Insecto"), new Terrestre("Terrestre"));
                break;
            case 1:
                animal = new Mascotas("Pescado", 2, 3, 1, new Acuatico("Acuatico"));
                break;
            case 2:
                animal = new Mascotas("Mosquito", 2, 2, 1, new Volador("Volador"));
                break;
            case 3:
                animal = new Mascotas("Grillo", 1, 2, 1, new Insecto("Insecto"));
                break;
            case 4:
                animal = new Mascotas("Castor", 2, 2, 1, new Terrestre("Terrestre"), new Acuatico("Acuatico"));
                break;
            case 5:
                animal = new Mascotas("Mosquito", 2, 1, 1, new Mamifero("Mamifero"), new Domestico("Domestico"));
                break;
            case 6:
                animal = new Mascotas("Nutria", 1, 2, 1, new Mamifero("Mamifero"));
                break;
            case 7:
                animal = new Mascotas("Escarabajo", 2, 3, 1, new Insecto("Insecto"));
                break;
            //Tier 2
            case 8:
                animal = new Mascotas("Sapo", 3, 3, 1, new Terrestre("Terrestre"), new Acuatico("Acuatico"));
                break;
            case 9:
                animal = new Mascotas("Dodo", 2, 3, 1, new Volador("Volador"));
                break;
            case 10:
                animal = new Mascotas("Elefante", 3, 5, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                break;
            case 11:
                animal = new Mascotas("Puerco_Espin", 3, 2, 1, new Solitario("Solitario"), new Terrestre("Terrestre"));
                break;
            case 12:
                animal = new Mascotas("Pavoreal", 2, 5, 1, new Domestico("Domestico"), new Volador("Volador"));
                break;
            case 13:
                animal = new Mascotas("Rata", 4, 5, 1, new Terrestre("Terrestre"), new Solitario("Solitario"));
                break;
            case 14:
                animal = new Mascotas("Zorro", 5, 2, 1, new Solitario("Solitario"), new Terrestre("Terrestre"));
                break;
            case 15:
                animal = new Mascotas("Arana", 2, 2, 1, new Insecto("Insecto"));
                break;
            //Tier 3
            case 16:
                animal = new Mascotas("Camello", 2, 5, 1, new Mamifero("Mamifero"), new Desertico("Desertico"));
                break;
            case 17:
                animal = new Mascotas("Mapache", 5, 4, 1, new Solitario("Solitario"));
                break;
            case 18:
                animal = new Mascotas("Jirafa", 2, 5, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                break;
            case 19:
                animal = new Mascotas("Tortuga", 1, 2, 1, new Reptil("Reptil"));
                break;
            case 20:
                animal = new Mascotas("Caracol", 2, 2, 1, new Insecto("Insecto"), new Solitario("Solitario"));
                break;
            case 21:
                animal = new Mascotas("Oveja", 2, 2, 1, new Domestico("Domestico"), new Terrestre("Terrestre"));
                break;
            case 22:
                animal = new Mascotas("Conejo", 3, 2, 1, new Mamifero("Mamifero"));
                break;
            case 23:
                animal = new Mascotas("Lobo", 3, 4, 1, new Solitario("Solitario"), new Terrestre("Terrestre"));
                break;
            case 24:
                animal = new Mascotas("Buey", 1, 4, 1, new Mamifero("Mamifero"));
                break;
            case 25:
                animal = new Mascotas("Canguro", 1, 2, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                
                break;
            case 26:
                animal = new Mascotas("Buho", 5, 3, 1, new Volador("Volador"), new Solitario("Solitario"));
                break;
            //Tier 4
            case 27:
                animal = new Mascotas("Venado", 1, 1, 1, new Mamifero("Mamifero"));
                break;
            case 28:
                animal = new Mascotas("Loro", 5, 3, 1, new Volador("Volador"));
                break;
            case 29:
                animal = new Mascotas("Hipopótamo", 4, 7, 1, new Acuatico("Acuatico"), new Terrestre("Terrestre"));
                break;
            case 30:
                animal = new Mascotas("Delfín", 4, 6, 1, new Acuatico("Acuatico"));
                break;
            case 31:
                animal = new Mascotas("Puma", 3, 7, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                break;
            case 32:
                animal = new Mascotas("Ballena", 3, 8, 1, new Acuatico("Acuatico"));
                break;
            case 33:
                animal = new Mascotas("Ardilla", 2, 5, 1, new Domestico("Domestico"));
                break;
            case 34:
                animal = new Mascotas("Llama", 3, 6, 1, new Terrestre("Terrestre"));
                break;
            //Tier 5
            case 35:
                animal = new Mascotas("Foca", 3, 8, 1, new Acuatico("Acuatico"), new Mamifero("Mamifero"));
                break;
            case 36:
                animal = new Mascotas("Jaguar", 7, 4, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                break;
            case 37:
                animal = new Mascotas("Escorpión", 1, 1, 1, new Domestico("Desertico"), new Solitario("Solitario"));
                break;
            case 38:
                animal = new Mascotas("Rinoceronte", 5, 8, 1, new Desertico("Desertico"), new Terrestre("Terrestre"));
                break;
            case 39:
                animal = new Mascotas("Mono", 1, 2, 1, new Mamifero("Mamifero"));
                break;
            case 40:
                animal = new Mascotas("Cocodrilo", 8, 4, 1, new Reptil("Reptil"), new Solitario("Solitario"));
                break;
            case 41:
                animal = new Mascotas("Vaca", 4, 6, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                break;
            case 42:
                animal = new Mascotas("Chompipe", 3, 4, 1, new Terrestre("Terrestre"), new Volador("Volador"));
                break;
            //Tier 6
            case 43:
                animal = new Mascotas("Panda", 5, 5, 1, new Mamifero("Mamifero"), new Solitario("Solitario"));
                break;
            case 44:
                animal = new Mascotas("Gato", 4, 5, 1, new Mamifero("Mamifero"), new Domestico("Domestico"));
                break;
            case 45:
                animal = new Mascotas("Tigre", 4, 3, 1, new Terrestre("Terrestre"), new Mamifero("Mamifero"));
                break;
            case 46:
                animal = new Mascotas("Serpiente", 6, 6, 1, new Reptil("Reptil"), new Terrestre("Terrestre"), new Desertico("Desertico"));
                break;
            case 47:
                animal = new Mascotas("Mamut", 3, 10, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"), new Solitario("Solitario"));
                break;
            case 48:
                animal = new Mascotas("Leopardo", 10, 4, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                break;
            case 49:
                animal = new Mascotas("Gorila", 6, 9, 1, new Mamifero("Mamifero"), new Terrestre("Terrestre"));
                break;
            case 50:
                animal = new Mascotas("Pulpo", 8, 8, 1, new Acuatico("Acuatico"), new Solitario("Solitario"));
                break;
            case 51:
                animal = new Mascotas("Mosca", 5, 5, 1, new Volador("Volador"), new Insecto("Insecto"));
                break;
            //Tier 7
            case 52:
                animal = new Mascotas("Quetzal", 10, 10, 1, new Volador("Volador"), new Solitario("Solitario"));
                break;
            default:
                animal = new Mascotas("Camaleon", 8, 8, 1, new Reptil("Reptil"), new Solitario("Solitario"));
                break;
        }
        
        if (isIA) {
            //sout que puede servir para los reportes
            System.out.println("se añade animal a ia");
            inteligenciaArtificial.AnadirAnimal(animal);
            animal = null;
        } else {
            //sout que puede servir para los reportes
            String compra = "se añade " + OpAnimal + ") " + animal.getAnimal() + " a jugador";
            reporte.setLog(compra);
            System.out.println(compra);
            jugador.AnadirAnimal(animal);
            compra = "";
            animal = null;
        }
    }
    
    private int tierAnimal(int slot) {
        Random RanBot = new Random();
        if (slot < 2) {
            return RanBot.nextInt(8);
        }
        if (slot >= 2 && slot < 3) {
            return RanBot.nextInt(16) + 8;
        }
        if (slot >= 3 && slot < 6) {
            return RanBot.nextInt(19) + 16;
        }
        if (slot >= 6 && slot < 9) {
            return RanBot.nextInt(8) + 35;
        } else {
            return RanBot.nextInt(11) + 43;
        }
    }
    
    public String[] getNombreAnimal() {
        return NombreAnimal;
    }
}
