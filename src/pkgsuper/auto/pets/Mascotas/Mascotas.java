package pkgsuper.auto.pets.Mascotas;

public class Mascotas {

     String Animal;
     int Ataque;
     int Vida;
     int Nivel;
     TipoMascota Tipo;
     TipoMascota Tipo2;
     TipoMascota Tipo3;

     public Mascotas(String Animal, int Ataque, int Vida, int Nivel, TipoMascota Tipo) {
          this.Animal = Animal;
          this.Ataque = Ataque;
          this.Vida = Vida;
          this.Nivel = Nivel;
          this.Tipo = Tipo;
     }

     public Mascotas(String Animal, int Ataque, int Vida, int Nivel, TipoMascota Tipo, TipoMascota Tipo2) {
          this.Animal = Animal;
          this.Ataque = Ataque;
          this.Vida = Vida;
          this.Nivel = Nivel;
          this.Tipo = Tipo;
          this.Tipo2 = Tipo2;
     }

     public Mascotas(String Animal, int Ataque, int Vida, int Nivel, TipoMascota Tipo, TipoMascota Tipo2, TipoMascota Tipo3) {
          this.Animal = Animal;
          this.Ataque = Ataque;
          this.Vida = Vida;
          this.Nivel = Nivel;
          this.Tipo = Tipo;
          this.Tipo2 = Tipo2;
          this.Tipo3 = Tipo3;
     }

     public String getAnimal() {
          return Animal;
     }
     
     public void crear(int[] IdAnimal) {
     }

     public int getVida() {
          return Vida;
     }

     public void setVida(int Vida) {
          this.Vida = Vida;
     }

     public int getAtaque() {
          return Ataque;
     }

     public void setAtaque(int Ataque) {
          this.Ataque = Ataque;
     }

     @Override
     public String toString() {
          String animal = Animal + ":\n\theal: \t" + Vida + "\n\tpower:\t" + Ataque + "\n\tlevel:\t" + Nivel + "\n\tTipo:\t" + Tipo.getTipoMascota();
          if (Tipo2 != null) {
               animal += "\n\tTipo2:\t" + Tipo2.getTipoMascota();
          } if (Tipo3 != null) {
               animal += "\n\tTipo3:\t" + Tipo3.getTipoMascota();
          } 
          return animal;
     }

}
