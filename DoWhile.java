import java.util.*;
public class DoWhile {

    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        int userLimit = 2;
        Scanner scnInput = new  Scanner(System.in);
        String usuario;
        try{
            while (usersLogged.size() < userLimit){
                System.out.println("Digite um nome do usuario e/ou tecle enter para gerar um nome de usuário aleatório");
                usuario = scnInput.nextLine();
                if (usuario != ""){
                    usersLogged.add(usuario);
                }else{
                   usersLogged.add("user" + Math.random());
                }
                Thread.sleep(1000);

            }
            for(int i = 0; i < userLimit; i++){
                System.out.println("Usuário " + (i+1) + " Logado como " + usersLogged.get(i));
            }

            System.out.println("Limite de usuário atingido");
        } catch(Exception e){
            System.out.println("Ops ocorreu um erro" + e.getMessage());
        }
        scnInput.close();
    }
}
