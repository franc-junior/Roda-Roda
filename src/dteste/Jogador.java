package dteste;

public class Jogador {
     private String nome;
     private float pontos = 0.0f;// valor em dinheiro que o jogador possui
     //private int pontos = 0;
     
     public Jogador(String nome){ 
         this.nome=nome;
     }
     
     public void ganharPontos(float i){//atualiza a pontuação do jogador
        pontos = pontos+i;
         
     }
     public void perdeuTudo(){
         pontos *= 0;
     }
     
     public float getPontos(){//retorna quantos pontos o jogador possui
         return pontos;
     }
     
     public String getNome(){//retorna o nome do jogador
         return nome;
     }
    
}
