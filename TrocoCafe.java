import java.util.Scanner;

public class TrocoCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PRECO_CAFE = 2.50;
        double total = 0.0;

        System.out.print("Moedas inseridas: ");
        String linha = sc.nextLine();

        String[] partes = linha.split("\\+");
        for (String parte : partes) {
            double moeda = Double.parseDouble(parte.trim());

            if (moeda == 0.50 || moeda == 1.00 || moeda == 2.00) {
                total += moeda;
            } else {
                System.out.println("Moeda inválida: " + moeda);
            }
        }

        System.out.printf("Valor total: R$ %.2f\n", total);

        if (total == PRECO_CAFE) {
            System.out.println("Pagamento exato. Sem troco.");
        } else if (total > PRECO_CAFE) {
            System.out.printf("Troco: R$ %.2f\n", total - PRECO_CAFE);
        } else {
            System.out.printf("Faltam R$ %.2f para completar o valor.\n", PRECO_CAFE - total);
        }

        sc.close();
    }
}
