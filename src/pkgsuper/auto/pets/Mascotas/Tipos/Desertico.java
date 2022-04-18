package pkgsuper.auto.pets.Mascotas.Tipos;

import pkgsuper.auto.pets.Mascotas.TipoMascota;

public class Desertico extends TipoMascota {

     String nombreMascota;

     public Desertico(String nombreMascota) {
         super(nombreMascota);
          this.nombreMascota = nombreMascota;
     }

     @Override
     public String getTipoMascota() {
          return nombreMascota;
     }

}
