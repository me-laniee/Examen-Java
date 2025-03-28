import java.util.Scanner;

public class Examen2{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("+----------------------+");
        double numero;
        System.out.print("Ingresa un numero: ");
        numero = scanner.nextDouble();
        double resultado1 = numero + (3* numero);
        System.out.println("Resultado: " + resultado1);
        System.out.println("+----------------------+");

        System.out.println("+----------------------+");
        System.out.print("Ingresa un numero: ");
                    numero = scanner.nextDouble();
                    double resultado2 = ((numero *2 ) - 5);
                    System.out.println("Resultado: " + resultado2);
                    System.out.println("+----------------------+");

                    System.out.println("+----------------------+");
                    System.out.print("Ingresa un numero: ");
                    numero = scanner.nextDouble();
                    double resultado3 = (numero/2) + (numero * numero);
                    System.out.println("Resultado: " + resultado3);
                    System.out.println("+----------------------+");

                    System.out.println("+----------------------+");
                    System.out.print("Ingresa un numero: ");
                    numero = scanner.nextDouble();
                    double resultado4 = (numero/2) + (numero * numero) + (numero* numero*numero);
                    System.out.println("Resultado: " + resultado4);
                    System.out.println("+----------------------+");

                    Scanner opciones = new Scanner(System.in);
                    int opcion;
                    double numeros;
                    
                    do {
                        System.out.println("Menu de Operaciones:");
                        System.out.println("[1] ejercicio 1");
                        System.out.println("[2] ejercicio 2");
                        System.out.println("[3] ejercicio 3");
                        System.out.println("[4] salir!!");
                        System.out.print("Selecciona una opcion: ");
                        
                        opcion = scanner.nextInt();
                        
                        switch(opcion) {
                            case 1:
                           System.out.println("+-------------+");
                            System.out.print("Ingrese el primer número: ");
                            double num11 = scanner.nextDouble();
                            double promedio = (num11 / 3);
                            System.out.println("El promedio del numero es: " + promedio);
                            System.out.println("+-------------+");
                                break;
                                
                            case 2:
                            System.out.println("+-------------+");
                                System.out.println("Buscando tu nombre...");
                                String texto= scanner.nextLine();
                            System.out.println("Tu nombre es Melanie!!! " + texto);
                            System.out.println("+-------------+");
                                break;
                                
                            case 3:
                            System.out.println("+-------------+");
                                System.out.println("Hola mundoooo!!!");
                                System.out.println("+-------------+");
                                break;
                                
                            default:
                                System.out.println("Opcion no encontrada");
                        }
                        
                    } while (opcion != 4);

        
    
    }
}