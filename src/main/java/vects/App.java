package vects;

import entities.Aluguel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Aluguel[] vect = new Aluguel[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++ ){
            System.out.println("Aluguel "+ i +":");
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Aluguel(nome,email);
        }
        sc.nextLine();
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i < 10;i++){
            if(vect[i] != null){
                System.out.println(i+": "+ vect[i]);
            }
        }

        sc.close();

    }
}
