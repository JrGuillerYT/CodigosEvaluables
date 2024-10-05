package jrguilleryt;
public class Parcial1 { 
public static void main(String[] args) {
    
        int dividendo = 6; 
        int divisor = 4; 
        
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return;
        } 
        
        int cociente = 0;
        int residuo = dividendo;
        
        while (residuo >= divisor) {
            residuo -= divisor; 
            cociente++;         
        }
        
        if (residuo == 0) {
            System.out.println("La división es exacta.");
            System.out.println("Resultado: " + cociente);
        } else {
            System.out.println("La división es inexacta.");
            System.out.println("Resultado: " + cociente);
            System.out.println("Residuo: " + residuo);
        }
    }
}
