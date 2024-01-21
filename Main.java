import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeerNombreYCorreo();
    }

    static void LeerNombreYCorreo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Ingrese su nombre: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese su correo: ");
        String correo = scanner.nextLine();
        System.out.println();
        System.out.println("Su nombre es: " + name);
        System.out.println("Su correo es: " + correo);

        scanner.close();
    }
}