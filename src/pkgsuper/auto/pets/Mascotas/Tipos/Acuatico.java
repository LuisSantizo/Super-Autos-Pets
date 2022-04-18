package pkgsuper.auto.pets.Mascotas.Tipos;

import pkgsuper.auto.pets.Mascotas.TipoMascota;

public class Acuatico extends TipoMascota {

     String nombreMascota;

     public Acuatico(String nombreMascota) {
          super(nombreMascota);
          this.nombreMascota = nombreMascota;

     }

     @Override
     public String getTipoMascota() {
          return nombreMascota;
     }

}
