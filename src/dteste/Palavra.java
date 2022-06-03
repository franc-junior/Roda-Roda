package dteste;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Palavra {
    private String palavra;
    private List<String> resposta = new ArrayList<String>(); // lista que armazena o que vai ser apresentado na tela
    private  Random gerador = new Random(); //número aléatorio
    
    public Palavra(String palavra){ // gera a lista de "-" no tamanho da string, (formato inicial)
        this.palavra=palavra;
        for (int i=0; i<=palavra.length();i++){
            resposta.add("-");
        }
    }
    public int verificaLetra(char letra){ //verifica e adciona a letra inserida pelo usuario, retornando a quantidade de letras presentes na string
        int cont = 0; //quantidade de letras encontradas
        for (int i = 0; i<palavra.length(); i++){
            char c = palavra.charAt(i); 
            if ((letra == c)){
                resposta.set(i, String.valueOf(c)); //subistitui o elemento 
                cont++;                             //String.valueOf(c) converte char em string
            }
        }
        return cont;
    }
    
    public boolean verificaPalavra(String palavraUsuario){
        boolean n = false;
        for (int i = 0; i<palavra.length(); i++){
            char p1 = palavra.charAt(i);
            char p2 = palavraUsuario.charAt(i);
            if(p1!=p2){n = true; break;}
        }
        if(n==true){return false;}  
        else{return true;}
        
    }
    
    public int verificaFim(){// verifica se a palavra está completa, observando se existe algum "-" na lista resposta ((tentei fazer comparando mas não deu certo não sei por que))
        String letra="-";
        int cont = 0;
        for (int i = 0; i<palavra.length(); i++){
            String c = resposta.get(i); //Acessando elelmentos da lista resposta
            if ((letra == c)){
                cont++;
            }
        }
        return cont; //se retornar 0 a palavra está completa
    }
    
    public String getResposta(){ //retorna a a lista em formato de string, saida principal
        String palavraCompleta = "";
        for (int i = 0; i<=palavra.length()-1;i++){
            palavraCompleta += resposta.get(i); 
        }
        return palavraCompleta;      
    }
    public String getPalavra(){ //retorna a palavra a ser adivinhada caso necessario 
        return palavra;
    }
    public float dinheiro(){ //retorna de forma aleatoria quanto vai valer cada letra(ROLETA)
        int valor = gerador.nextInt(10);// numero aleatorio de 0 a 10 
        float sort = 0.0f; // valor a ser retornado, como valor em dinheiro
        switch(valor){//recebe o numero aleatorio de 0 a 10 e indica quanto vale de verdade
            case 0:
                sort = 0;
                break;
            case 1:
                sort = 100.0f;
                break;
            case 2:
                sort = 200.0f;
                break;
            case 3:
                sort = 300.0f;
                break;
            case 4:
                sort = 400.0f;
                break;
            case 5:
                sort = 500.0f;
                break;
            case 6:
                sort = 600.0f;
                break;
            case 7:
                sort = 700.0f;
                break;
            case 8:
                sort = 800.0f;
                break;
            case 9:
                sort = 900.0f;
                break;
            case 10:
                if (gerador.nextInt(2) == 2){sort = 0.0f;}
                else{sort = 1000.0f;}
                break;
        }  
        return sort;
    }
    
}
