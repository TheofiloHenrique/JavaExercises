package exercise;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados?:");
        int numeroFuncionarios = sc.nextInt();

        for (int i = 0; i < numeroFuncionarios; i++){
            System.out.println("Funcionário #"+ (i+1) );
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            Double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id,nome,salario);
            list.add(funcionario);


        }

        System.out.print("Informe o id do funcionário que você deseja aumentar o salário:");
        int idSalario = sc.nextInt();

        Integer posicao = posicaoId(list,idSalario);
        if(posicao == null)
            System.out.println("O ID informado não existe!");
        else{
            System.out.println("Informe a porcentagem: ");
            double porcentagem = sc.nextDouble();
            list.get(posicao).aumentarSalario(porcentagem);
        }

        for(Funcionario funcionario : list)
            System.out.println(funcionario);

        sc.close();

    }

    public static Integer posicaoId (List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
