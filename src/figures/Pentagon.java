// Pentagon.java
package figures;

public class Pentagon {
  
    public static void calculateArea() {

        System.out.print("Ingrese el lado del pentágono: ");
        double side = Main.scanner.nextDouble();
        System.out.print("Ingrese la apotema del pentágono: ");
        double apothem = Main.scanner.nextDouble();
        double area = 0.5 * 5 * side * apothem;
        System.out.println("El área del pentágono es: " + area);
    
    }
       

        
       
       
}


    
