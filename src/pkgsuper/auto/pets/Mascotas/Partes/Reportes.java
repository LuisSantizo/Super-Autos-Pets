package pkgsuper.auto.pets.Mascotas.Partes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Reportes {

    private final String LogBatalla = System.getProperty("user.dir");
    private String log = "";

    public void guardarLogBatalla() throws IOException, FileNotFoundException {
        FileOutputStream fileOutput;
        ObjectOutputStream salida;

        fileOutput = new FileOutputStream(LogBatalla + "/batallas.txt");
        salida = new ObjectOutputStream(fileOutput);
        salida.writeObject(log);
        salida.close();
    }

    public void DatosFinalesXPartida(int OroGatado, int TotalDañoRecibido, int intTotalDañoRealizado,int AnimalesUsados) {
        String datosFinales;
        datosFinales = "El oro gastado en la partida fue: "+OroGatado+
                "\nEl total de daño recibido en la partida fue: "+TotalDañoRecibido+
                "\nEl total de daño realizado en la partida fue: "+intTotalDañoRealizado+ 
                "\nEl total de animales usados en la partida fue: "+AnimalesUsados;
        System.out.println(datosFinales);
        setLog(datosFinales);
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log += log;
    }

}
