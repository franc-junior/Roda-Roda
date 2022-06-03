package dteste;

import java.util.Random;
import java.util.Scanner;
	
public class Palavrasrnd {
    // os 4 temas com suas respectivas palavras
    static String[] animal = {"cachorro", "gato", "cavalo", "macaco"};
    static String[] cidade = {"fortaleza", "barbalha", "juazeiro", "crato"};
    static String[] fruta = {"banana", "melancia", "goiaba", "maracuja"};
    static String[] cantor = {"luan santana", "gustavo lima", "marilia mendonca", "henrique e juliano"};

//escolha do tema e seleciona a chama a função do tema random
public static String tema() {
    Scanner input = new Scanner(System.in);
    System.out.println("temas: 1-animal, 2-cidade, 3-fruta, 4-cantor");
    System.out.print("qual sera o tema de hoje? ");
    int tema = input.nextInt();
    String palavra = "";
    // escolha do tema com um if ja chamando a função pra pegar o rnd do respectivo tema
    if(tema == 1) {
        System.out.println("o tema escolhido foi animal boa sorte :)");
        palavra = arrayRnd(Palavrasrnd.animal);
    }
    else if(tema == 2) {
        System.out.println("o tema escolhido foi cidade boa sorte :)");
        palavra = arrayRnd(Palavrasrnd.cidade);
    }
    else if(tema == 3) {
        System.out.println("o tema escolhido foi fruta boa sorte :)");
        palavra = arrayRnd(Palavrasrnd.fruta);
    }
    else if(tema == 4) {
        System.out.println("o tema escolhido foi cantor boa sorte :)");
        palavra = arrayRnd(Palavrasrnd.cantor);
    }
    else {
        System.out.println("TEMA INVÁLIDO");
        return tema();// se digitar errado usa recursão pra chamar o metodo de novo
    }

    return palavra;
}

// seleciona uma palavra random de um array
public static String palavraRandom(String[] array) {
    Random rnd = new Random();
    int indice = rnd.nextInt(array.length);
    return array[indice];
}   
// seleciona uma palavra random de um tema selecionado
public static String arrayRnd(String[] array) {
    return palavraRandom(array);
}

}