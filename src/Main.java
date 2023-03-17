import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double numero, resultado;
        int contador = 1;
        Scanner scan = new Scanner(System.in);
        try {
            while (contador <= 4) {
                System.out.println("Ingrese un número de 10 cifras: ");
                numero = scan.nextDouble();
                if (numero > 999999999) {
                    resultado = Math.pow(numero, 4);
                    System.out.println("El resultado de elevar el número " + numero + " a la 4 es: " + resultado);
                    contador ++;
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }


    }
}