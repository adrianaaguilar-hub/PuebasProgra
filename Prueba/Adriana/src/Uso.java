import java.util.Scanner;

public class Uso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa segundos");
        int segundos = scanner.nextInt();

        System.out.println("Ingresa minutos");
        int minutos = scanner.nextInt();
        
        System.out.println("Ingresa horas");
        int horas = scanner.nextInt();
        

        
        Cronometro cronometro = new Cronometro (segundos, minutos, horas);

        System.err.println(cronometro);

        scanner.close();
    }

    
}
