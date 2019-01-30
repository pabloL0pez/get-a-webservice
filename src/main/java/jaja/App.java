package jaja;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    
    private static final String ACTIVADO = "true";
    private static final String HOST = "10.71.13.4";
    private static final String PUERTO = "8080";

    private static final String WEBSERVICE = "https://gturnquist-quoters.cfapps.io/api/random";

    public static void main(String[] args) {

        inicializarProxy(); // proxy de mierd@@@@@
        
        ObjectMapper mapper = new ObjectMapper();

        try {

            URL url = new URL(WEBSERVICE);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setRequestProperty("Accept", "application/json");
    
            if (conexion.getResponseCode() != 200) {
                throw new RuntimeException("Falló la conexión : código de error HTTP : "+ conexion.getResponseCode());
            }

            Cita cita = mapper.readValue(conexion.getInputStream(), Cita.class);

            System.out.println("Tipo: " + cita.getTipo());
            System.out.println("    ID: " + cita.getValor().getId());
            System.out.println("    Cita: " + cita.getValor().getCita());
    
            conexion.disconnect();
    
          } catch (MalformedURLException e) {
            e.printStackTrace();
    
          } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nDONE.");
    }

    public static void inicializarProxy() {
        System.setProperty("https.proxySet", ACTIVADO);
        System.setProperty("https.proxyHost", HOST);
        System.setProperty("https.proxyPort", PUERTO);
    }
}
