import java.util.Scanner;

public class ReuniaoSemFim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // uso do Scanner pela simplicidade para entrada de dados no console

        System.out.print("Hora de início (hh mm): ");
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();

        System.out.print("Hora atual (hh mm): ");
        int horaAtual = sc.nextInt();
        int minutoAtual = sc.nextInt();

        // converter para minutos facilita o cálculo da diferença de tempo
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int atualEmMinutos = horaAtual * 60 + minutoAtual;

        // caso a hora atual seja menor que a inicial, significa que passou da meia-noite
        // por isso somamos 24h em minutos para manter a lógica correta
        int duracao = atualEmMinutos - inicioEmMinutos;
        if (duracao < 0) {
            duracao += 24 * 60; // usar minutos evita complicações com horas negativas
        }

        // divisão e resto permitem separar de forma direta horas e minutos
        int horas = duracao / 60;
        int minutos = duracao % 60;

        // uso de printf porque permite formatar a saída com zeros à esquerda em minutos
        System.out.printf("Tempo total: %dh%02dmin\n", horas, minutos);

        sc.close(); // fechar o Scanner é uma boa prática para liberar recursos
    }
}