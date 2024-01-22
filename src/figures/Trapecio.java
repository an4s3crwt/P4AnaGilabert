package figures;

public class Trapecio {
    

    public static void calcularAreaTrapecio() {
       
        // Solicitar al usuario que ingrese la longitud de los lados del trapecio
        System.out.println("Ingrese la longitud de la BASE MAYOR del trapecio: ");
        double baseMayor = Main.scanner.nextDouble();

        System.out.println("Ingrese la longitud de la BASE MENOR del trapecio: ");
        double baseMenor = Main.scanner.nextDouble();

        System.out.println("Ingrese la ALTURA del trapecio: ");
        double altura = Main.scanner.nextDouble();

        // Calcular el área del trapecio en base a su fórmula
        double area = ((baseMayor + baseMenor)/2 ) * altura;

        // Mostrar el resultado
        System.out.println("El área del trapecio es: " + area);
    }

   
    
}


