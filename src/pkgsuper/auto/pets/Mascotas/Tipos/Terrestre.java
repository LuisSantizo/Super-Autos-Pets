package pkgsuper.auto.pets.Mascotas.Tipos;

import pkgsuper.auto.pets.Mascotas.TipoMascota;

public class Terrestre extends TipoMascota {

     String nombreMascota;

     public Terrestre(String nombreMascota) {
     super(nombreMascota);
          this.nombreMascota = nombreMascota;
     }

     @Override
     public String getTipoMascota() {
          return nombreMascota;
     }

}
