package pkgsuper.auto.pets.Mascotas.Tipos;

import pkgsuper.auto.pets.Mascotas.TipoMascota;

public class Mamifero extends TipoMascota {

     String nombreMascota;

     public Mamifero(String nombreMascota) {
       super(nombreMascota);
          this.nombreMascota = nombreMascota;
     }

     @Override
     public String getTipoMascota() {
          return nombreMascota;
     }

}
