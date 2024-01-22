// Rectangle.java
package figures;


public class Rectangle {

    public static void calculateArea() {
      
        System.out.print("Ingrese la base del rectángulo: ");
        double base = Main.scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double height = Main.scanner.nextDouble();
        double area = base * height;
        System.out.println("El área del rectángulo es: " + area);

       
      
      
       
    }

}