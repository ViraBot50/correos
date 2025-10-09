package org.example;

import java.io.*;

public class Document {


    public String m_getText(String p_ruta){
        String v_respuesta="",v_linea;
        try {
            BufferedReader br = new BufferedReader(new FileReader(p_ruta));
            while ((v_linea = br.readLine()) != null) {
                v_respuesta+=v_linea+"\n";
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        v_respuesta=v_respuesta.trim();

        return v_respuesta;
    }

    public void m_writeText(String p_ruta, String p_msg){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(p_ruta))) {
            bw.write(p_msg);
            bw.write("Otra línea");
            System.out.println("Archivo escrito correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
