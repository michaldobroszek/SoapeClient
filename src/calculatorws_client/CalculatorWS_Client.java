/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class CalculatorWS_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
    System.out.println("Przykladowy klient SOAP.");
    System.out.println("Wprowadz pierwsza liczbe: ");
    float a = reader.nextFloat();
    System.out.println("Wprowadz druga liczbe: ");
    float b = reader.nextFloat();
    try {
     float c = add(a, b);
    // float d = mod(a,b);
     System.out.println("Wynik dodawania:  " + c);
     // System.out.println("Wynik dzielenia:  " + d);
    } catch (Exception ex) {
     System.out.println("Wystapil blad: " + ex);
    }
    reader.close();
    }

    private static float add(float a, float b) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(a, b);
    }

   

    
}
