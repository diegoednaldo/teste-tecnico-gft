import java.util.Scanner;

public class ReuniaoSemFim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora de início (hh mm): ");
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();

        System.out.print("Hora atual (hh mm): ");
        int horaAtual = sc.nextInt();
        int minutoAtual = sc.nextInt();

        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int atualEmMinutos = horaAtual * 60 + minutoAtual;

        int duracao = atualEmMinutos - inicioEmMinutos;
        if (duracao < 0) {
            duracao += 24 * 60;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.printf("Tempo total: %dh%02dmin\n", horas, minutos);

        sc.close();
    }
}