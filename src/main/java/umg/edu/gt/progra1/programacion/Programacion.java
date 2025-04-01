/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.progra1.programacion;

import java.util.Scanner;
import umg.edu.gt.progra1.programacion.estructuraDeDatos.Vectores;
import umg.edu.gt.progra1.programacion.estructuradecontrol.example.IfElseExample;
import umg.edu.gt.progra1.programacion.estructuradecontrol.example.LoopExample;
import umg.edu.gt.progra1.programacion.estructuradecontrol.example.SwitchCaseExample;

/**
 *
 * @author wcord
 */
public class Programacion {

    public static void main(String[] args) {
        System.out.println("Hola bienvenido a Progra 1");
        testVectores();
    }
    
    
    // IF ELSE
    public static void testTriangulo() {
        
        IfElseExample ifElseExamp = new IfElseExample();        
        ifElseExamp.validarTriangulo(5, 5, 5);        
        ifElseExamp.validarTriangulo(6, 6, 4);        
        ifElseExamp.validarTriangulo(3, 4, 5);
        ifElseExamp.validarTriangulo(2, 2, 5);
    }
    
    public static void testIfSimple() {
        // Istanciar clase como objeto
        // NombreClase nombreObjeto = new NombreClase();
        IfElseExample ifElseExamp = new IfElseExample();
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        scanner.close();
    }
    
    // Switch
    public static void testSwitchSimple() {
        
        SwitchCaseExample switchExample = new SwitchCaseExample();
        String diaEnLetras = switchExample.getDiaSemana(4);
        System.out.println("El resultado es: " + diaEnLetras);
    }
    
    public static void testSwitchReducido() {
        SwitchCaseExample switchExample = new SwitchCaseExample();
        boolean esLaboral = switchExample.getDiasNoLaborales("Sabado");
        System.out.println("El dia es laboral: " + esLaboral);
    }
    
    public static void testLoop() {
        
        LoopExample test = new LoopExample();
        
        test.breakExample();
        test.continueExample();
        
    }
    
    public static void testVectores() {
        Vectores vectores = new Vectores();
        vectores.matrizExample();
    }
    
}
