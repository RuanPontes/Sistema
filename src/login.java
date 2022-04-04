import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String login = "usuario";
        String password = "senha";

        boolean exibirTelaLogin = true;

        while (exibirTelaLogin){
            System.out.println("Digite seu login: ");
            String loginDigitado = scanner.next();

            System.out.println("Digite seu password: ");
            String passwordDigitado = scanner.next();

            if (login.equals(loginDigitado) && password.equals(passwordDigitado)){
                System.out.println("Acesso concedido ");
                exibirTelaLogin = false;
            }else{
                System.out.println("Acesso negado");
            }
        }

    }
}
