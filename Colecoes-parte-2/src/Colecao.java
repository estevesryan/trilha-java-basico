import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecao {
    List<String> masculino = new ArrayList<>();
    List<String> feminino = new ArrayList<>();

    protected void start() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 9) {
            System.out.println("""
                    Digite uma opção:\s
                    1- Exibir pessoas sexo Feminino\s
                    2- Exibir pessoas Masculino\s
                    3- Adicionar pessoa\s
                    9- Sair
                    """);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    exibeFeminino();
                    break;
                case 2:
                    exibeMasculinos();
                    break;
                case 3:
                    addPessoa();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção invalida, Tente novamente!");
            }
        }

    }

    private void exibeMasculinos() {
        if(masculino.isEmpty()) {
            System.out.println("Sem pessoas cadastrado");
        }

       for (int i = 0; i < masculino.size(); i++) {
           System.out.println(i + 1 + ". " + masculino.get(i));
       }
    }

    private void exibeFeminino() {
        if (feminino.isEmpty()){
            System.out.println("Sem pessoas cadastrado");
        }

        for (int i = 0; i < feminino.size(); i++) {
            System.out.println(i + 1 + ". " + feminino.get(i));
        }
    }

    private void addSexo(String nome) {
        Scanner scanner = new Scanner(System.in);

        int sexo = 0;
        while (sexo != 1 && sexo != 2) {
            System.out.println("""
                    Digite seu sexo:\s
                    1- Masculino\s
                    2- Feminino\s
                    """);

            sexo = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (sexo) {
                case 1:
                    masculino.add(nome);
                    System.out.println("Pessoa adicionada à lista masculina.");
                    break;
                case 2:
                    feminino.add(nome);
                    System.out.println("Pessoa adicionada à lista feminina.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }
    }

    private void addPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        addSexo(nome);
    }

}
