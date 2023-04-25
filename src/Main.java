import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ConvidadoRH> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos convidados na festa?");
        int quant = scanner.nextInt();
        String numero = scanner.nextLine();
        for (int i = 1; i <= quant; i++) {

            System.out.println("Qual o seu nome?");
            String nome = scanner.nextLine();

            System.out.println("Qual o seu cpf?");
            String cpf = scanner.nextLine();

            System.out.println("Qual o seu telefone?");
            String telefone = scanner.nextLine();

            System.out.println("Qual a sua data de nascimento?");
            String dataNascimento = scanner.nextLine();

            System.out.println("Qual a sua data de agendamento?");
            String dataAgendamento = scanner.nextLine();

            System.out.println("Qual o periodo?");
            String periodo = scanner.nextLine();


            ConvidadoRH convidados = new ConvidadoRH(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);
            lista.add(convidados);

        }
        System.out.println(lista);




    }
}