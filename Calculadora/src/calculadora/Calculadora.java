
package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Operaciones objeto = new Operaciones();
        
        int num1 = 1;
        int num2 = 1;
        double resultado = 0;
        int opcion = 0;
        
        Scanner leer = new Scanner(System.in);
        
        try {
        //Obtención de la opción
        while (opcion == 0){
            System.out.println("¿Qué desea hacer?");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            opcion = leer.nextInt();
        }
        
        //Ingresa los datos a usar
        System.out.println("Ingrese 2 números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        //Se guardan los datos
        objeto.setDatos(num1, num2);
        
        //Se realiza la operación
        switch (opcion){
            case 1:
                resultado = objeto.sumar();
                break;
                
            case 2:
                resultado = objeto.restar();
                break;
                
            case 3:
                resultado = objeto.multiplicacion();
                break;
                
            case 4:
                resultado = objeto.division();
                break;
                
            default:
                System.out.println("Datos incorrectos");
                break;
        }
        
        //Desplegar resultados
        if (resultado != 0){
            System.out.println("El resultado es: " + resultado);
        }
        
        }
        catch (Exception e){
            System.out.println("Inserte algo correcto");
        }
    }

    
    
}
