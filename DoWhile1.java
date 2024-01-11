
import java.util.*;
public class DoWhile1 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        int usersLimit = 2;
        Scanner scnInput = new Scanner(System.in);
        String usuario;
        try {
            while (usersLogged.size() < usersLimit) {
                if (usersLogged.isEmpty()) {
                    System.out.println("Não há usuários conectados no momento");
                } else {
                    System.out.println(usersLogged.size() + " usuário(s) logado(s): " + usersLogged);
                }
                System.out.println("Digite um nome de usuario e/ou tecle enter para gerar um nome de usuario aleatório");
                usuario = scnInput.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
                } else {
                    usersLogged.add("user" + Math.ceil(Math.random() * 100));
                }
                Thread.sleep(1000);
            }
            System.out.println(usersLogged.size() + " usuário(s) logado(s): " + usersLogged);
            for (int i = 0; i < usersLogged.size(); i++) {
                System.out.println("Usuário [" + i + "] logado como '" + usersLogged.get(i) + "'");
            }
            System.out.println("Limite de usuários atingido");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e.getMessage());
        }
        scnInput.close();
    }
}