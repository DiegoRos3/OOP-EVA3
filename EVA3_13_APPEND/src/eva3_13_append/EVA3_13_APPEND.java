/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class EVA3_13_APPEND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here            
        String ruta = "C:\\archivostec\\";
        
        try {    
            writeUsingBufferedWriter(ruta + "archivoBufferedWriter.txt", "Prueba de datos de archivos usando la clase BufferedWriter!!");
        } catch (IOException ex) {
            ex.printStackTrace(); //imprime el problema
        }
        
    }
    
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufWriter.write(datos);
            bufWriter.write("\n");
            
        }
        bufWriter.close();
        fileWriter.close();
    }
}
