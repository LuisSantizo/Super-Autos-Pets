package pkgsuper.auto.pets.Mascotas.Tipos;

import pkgsuper.auto.pets.Mascotas.TipoMascota;

public class Solitario extends TipoMascota {

     String nombreMascota;

     public Solitario(String nombreMascota) {
          super(nombreMascota);
          this.nombreMascota = nombreMascota;
     }

     @Override
     public String getTipoMascota() {
          return nombreMascota;
     }
}
