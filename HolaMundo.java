import java.util.Scanner;

public class HolaMundo {
public static void main(String[] args) {
    //Imprimir datos en pantalla / consola / terminal
    System.out.println("Hola Marce!");

    System.out.print("Como van las cosas");

    System.out.printf("Aqui va una cadena: %s%n", "Marce");
    System.out.printf("Aqui va un entero: %d%n", 10);
    System.out.printf("Mi nombre es %s y tengo %d años%n", "Marce",15);


    var entrada = new Scanner(System.in);

    System.out.println("Por favor ingrese un nombre: ");
    var entero = entrada.nextLine();

    System.out.println(entero);

    entrada.close();
}
}