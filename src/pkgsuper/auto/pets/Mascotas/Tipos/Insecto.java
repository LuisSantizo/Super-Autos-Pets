package pkgsuper.auto.pets.Mascotas.Tipos;

import pkgsuper.auto.pets.Mascotas.TipoMascota;

public class Insecto extends TipoMascota {

     String nombreMascota;

     public Insecto(String nombreMascota) {
      super(nombreMascota);
          this.nombreMascota = nombreMascota;
     }
     
     @Override
     public String getTipoMascota() {
          return nombreMascota;
     }

}
