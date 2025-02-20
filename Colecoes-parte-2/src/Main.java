import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LerNomePessoasConsole();
        LerNomeSexoPessoas();
    }

    private static void LerNomePessoasConsole() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.print("Digite o nome do aluno: ");
        String nomeSemFormatar = input.nextLine();

        String[] formatados = nomeSemFormatar.split(",");
        Collections.addAll(nomes, formatados);

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    private static void LerNomeSexoPessoas() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        //    2-ler no console nomes de pessoas e separar nome - sexo Luana - F
        //separar por genero
        System.out.println("Digite o nome e o sexo: ");
        String[] pessoas = input.nextLine().split(",");
        for (String pessoa : pessoas) {
            String[] pessoaSeparada = pessoa.split("-");
            nomes.add(pessoaSeparada[0]);
            if (pessoaSeparada[1].equals("M")) {
                masculino.add(pessoaSeparada[0]);
            } else {
                feminino.add(pessoaSeparada[0]);
            }
        }

        //imprimir no console com os grupos separados
        System.out.println("Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }



}
