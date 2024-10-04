import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" CONTEOS MATEMATICOS "); //sout
        int inicio;
        int finaly;
        int incremento;
        System.out.print("Ingrese el inicio del conteo: "); //sout
        inicio = scanner.nextInt();
        System.out.print("Ingrese el final del conteo: "); //sout
        finaly = scanner.nextInt();
        System.out.print("Ingrese el incremento del conteo: "); //sout
        incremento = scanner.nextInt();
        for(int i = inicio ; i <= finaly; i = i + incremento) {
            System.out.printf("%d ", i);
        }
    }
}