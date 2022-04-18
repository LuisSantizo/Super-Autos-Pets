package pkgsuper.auto.pets.Mascotas.Tipos;

import pkgsuper.auto.pets.Mascotas.TipoMascota;

public class Volador extends TipoMascota {

     String nombreMascota;

     public Volador(String nombreMascota) {
     super(nombreMascota);
          this.nombreMascota = nombreMascota;
     }

     @Override
     public String getTipoMascota() {
          return nombreMascota;
     }

}
