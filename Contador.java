import java.util.Scanner;

public class Contador {

    static void contar(int numero_1, int numero_2) throws ParametrosInvalidosException {
        int contagem = numero_2 - numero_1;
        if(contagem > 0)
            for (int i = 0; i < contagem; i++) {
                System.out.printf("\nImprimindo o número %d ",i+1);
            }
        else {
            throw new ParametrosInvalidosException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe dois parâmetros numéricos");
        System.out.println("Parâmetro 1: ");
        int numero_1 = scanner.nextInt();
        System.out.println("Parâmetro 2: ");
        int numero_2 = scanner.nextInt();
        try {
            contar(numero_1,numero_2);

        } catch (ParametrosInvalidosException e) {
            e.getMessage();
        }
    }
}