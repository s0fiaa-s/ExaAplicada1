import java.util.Scanner;

public class Examen1 {
        public static void main(String[] args) {
          
                Scanner scanner = new Scanner(System.in);
                int opcion;

// MENU
        do{
                System.out.println("BIENVENIDO AL PROGRAMA");
                System.out.println("Resuelve las siguientes ecuaciones");

                System.out.println("[1] La suma de un número y triple");
                System.out.println("[2] El doble de un número menos 5");
                System.out.println("[3] La mitad de un número más su cuadrado");
                System.out.println("[4] La suma de un número, su doble y su triple");   
                System.out.print("Selecciona una opción: ");

                opcion = scanner.nextInt();

        switch (opcion) {
                case 1:
                    System.out.print("Coloca un número: ");
                    double numero1 = scanner.nextDouble();
                    System.out.println("Resultado1: " + (numero1 + 3 * numero1 ));
                    
                        break;

                case 2:
                System.out.print("Coloca un número: ");
                double numero2 = scanner.nextDouble();
                System.out.println("Resultado2: " + ((numero2 + 2 * numero2) - 5 ));
                    
                        break;

                case 3:
                System.out.print("Coloca un número: ");
                double numero3 = scanner.nextDouble();
                System.out.println("Resultado2: " + (numero3 / 2 + numero3 * numero3));
                        
                        break;

                case 4:
                System.out.print("Coloca un número4: ");
                double numero4 = scanner.nextDouble();
                System.out.println("Resultado2: " + (numero4 * 2 + numero4 * 3 + numero4));                        

                        break;
        }
                }while (opcion != 0);

// SEGUNDA PARTE

        Scanner scanner1 = new Scanner(System.in);
        int opcion2;

        do {
                System.out.println("Menú de Opciones: ");
                System.out.println("[1] Calcula el promedio");
                System.out.println("[2]] Saluda por tú nombre");
                System.out.println("[3] Salir");
                System.out.print("Selecciona una opción: ");
                opcion2 = scanner1.nextInt();
    }while (opcion2 != 0);


            
        }
}