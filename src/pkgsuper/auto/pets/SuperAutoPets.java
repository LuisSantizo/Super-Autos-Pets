package pkgsuper.auto.pets;

import java.util.InputMismatchException;
import java.util.Scanner;
import pkgsuper.auto.pets.Mascotas.Partes.*;

public class SuperAutoPets {

    Scanner Opcion = new Scanner(System.in);
    Scanner Us = new Scanner(System.in);
    Jugador Jugador;
    Jugador Jugador2;
    int JUG2 = 0;

    public static void main(String[] args) {
        SuperAutoPets main = new SuperAutoPets();
    }

    public SuperAutoPets() {
        IngresarUsuario();
        boolean salir = false;
        int Op;

        while (!salir) {
            System.out.print("Bienvenido a Super Auto Pets \n");
            System.out.println("1) Modo arena");
            System.out.println("2) Modo versus");
            System.out.println("3) Modo creativo");
            System.out.println("4) Salir");

            try {
                System.out.print("Ingrese una opcion:");
                Op = Opcion.nextInt();
                System.out.print("\n\n");
                switch (Op) {
                    case 1:
                        System.out.println("Bienvenido a Modo arena");
                        System.out.println("-----------------------");
                        ModoArena IngresoEqupIA = new ModoArena(getJugador());
                        break;
                    case 2:
                        System.out.println("Modo versus");
                        ModVersus();
                        break;
                    case 3:
                        System.out.println("Modo creativo");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("No se econtro la opcion\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero \n");
                Opcion.next();
            }
        }
    }

    public void IngresarUsuario() {
        String N1;
        System.out.print("ingrese el nombre del jugador: ");
        N1 = Us.nextLine();
        System.out.println("--------------------------------------\nBienvenido " + N1 + "\n--------------------------------------\n\n");
        setJugador(new Jugador(N1));
    }
    private void ModVersus(){
        System.out.println("Ingrese el nombre del Jugador No.2");
        String Nom2 = Us.nextLine();
        Jugador jugador2 = new Jugador(Nom2);
        ModoArena ModoVersus = new ModoArena(getJugador(), jugador2);
    }

    /**
     * @return the Jugador
     */
    private Jugador getJugador() {
        return Jugador;
    }

    /**
     * @param Jugador the Jugador to set
     */
    private void setJugador(Jugador Jugador) {
        this.Jugador = Jugador;
    }
}
