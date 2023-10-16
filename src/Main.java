import java.time.format.TextStyle;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // ola {nome}, hoje é {dia da semana}, BOM DIA
        String saudacao = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        LocalDate diasemana = LocalDate.now();
        Locale brasil = new Locale("pt","BR");

        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12 ){
            saudacao = "bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite!";
        }

        System.out.println("Olá " + nome + ", hoje é " + diasemana.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil) + ", " + saudacao);

        scanner.close();
    }
}
