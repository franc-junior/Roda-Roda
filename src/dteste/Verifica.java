package dteste;

import java.util.Scanner;

public class Verifica {

    // lê e verifica a opção roleta ou arriscar
    public static int opcao() {
        System.out.print("'1' Roleta / '2' Arriscar (R$ 10000): ");//printa se for 1 ou 2
        Scanner input = new Scanner(System.in);//pra pegar da entrada
        int op = input.nextInt();//pega um numero da entrada
        if(op != 1 & op != 2) {//verifica se o numero é 1 ou 2 '1' Roleta / '2' Arriscar
            System.out.println("Opção inválida, Escolha 1 ou 2");//se não for printa isso
            return Verifica.opcao();// chama a funcao dnv pra pegar o numero so que certo dessa vez
        }

        return op;// retorna o numero
    }
    //lê e verifica se estão digitando somente 1 caractere
    public static char caractere() {
        Scanner input = new Scanner(System.in);//pra pegar da entrada
        System.out.print("Digite uma letra: ");
        String entrada = input.nextLine();// lê uma string
        char ch = entrada.charAt(0);
        return ch;//retorna somenete o primeiro caractere digitado
    }	
}
