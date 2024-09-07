import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el metodo de pago: 1. Tarjeta de Credito 2. PayPal");
        int opcion = scanner.nextInt();
        
        MetodoPagoFactory factory;
        
        if (opcion == 1) {
            factory = new TarjetaCreditoFactory();
        } else if (opcion == 2) {
            factory = new PayPalFactory();
        } else {
            System.out.println("Opcion no valida");
            return;
        }
        
        MetodoPago metodoPago = factory.crearMetodoPago();
        metodoPago.procesarPago(100.0); // Ejemplo de pago de 100 dólares
        
        scanner.close();
    }
}
