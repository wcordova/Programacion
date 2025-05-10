/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author wcord
 */
public class EjemploArchivo {
    
    public void EjemploFile () {
        
        String carpeta = "datos";
        crearCarpeta(carpeta);
        
        File archivo = new File(carpeta + "/ejemplo.txt") ;

        try {
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado con exito en: " + archivo.getAbsolutePath());
            } else {            
                System.out.println("El archivo ya existe en: " + archivo.getAbsolutePath());
            } 
        } catch (IOException e) {
            System.err.println("Error creando el archivo: " + e.getMessage());
        }
        
    }
    
    private void crearCarpeta (String nombre) {
        File carpeta = new File(nombre) ;
         
        if(!carpeta.exists()) carpeta.mkdirs();
        
//        if(!carpeta.exists()) {
//            carpeta.mkdirs();
//            System.out.println("Carpeta "+ nombre +" creada!");
//        }
    }
    
    public void EjemploFileEscribir () {
        
        String carpeta = "datos";
        crearCarpeta(carpeta);
        
        String[] lineas = {
            "Primer linea de texto",
            "Segunda linea de texto",
            "Tercer linea de texto"
        };

        System.out.println("Iniciando escritura..");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("datos/salida.txt"))) {                        
            for(String linea : lineas) {
                bw.write(linea);
                bw.newLine();
                
            }
            System.out.println("Escritura completada!");
            
            
        } catch (IOException e) {
            System.err.println("Error creando el archivo: " + e.getMessage());
        }
        
    }
    
    public void EjemploFileLeer () {
        try(BufferedReader br = new BufferedReader(new FileReader("datos/salida.txt"))) {                        
           String linea;
           while((linea = br.readLine()) != null) {
                System.out.println(linea);
           }            
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
        }
        
    }
    
}
