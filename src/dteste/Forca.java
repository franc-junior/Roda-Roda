package dteste;
import java.util.Scanner;
public class Forca {

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jogador 1: ");
        Jogador jogador1 = new Jogador(input.nextLine());
        System.out.print("Jogador 2: ");
        Jogador jogador2 = new Jogador(input.nextLine());
        
		//      System.out.print("Digite uma palavra para teste: ");
		//      String palavraF = input.nextLine();
        
        // parte de zennon
        String palavraF = Palavrasrnd.tema();
        // fim da parte
        
        Palavra palav = new Palavra(palavraF);
        palav.verificaLetra(' ');
        System.out.println("Palavra: "+palav.getResposta());
        
        Boolean vez = true;
        Jogador jogador;
        
        while (true) {
            if (vez==true){
                jogador = jogador1;
                vez = false;
            }else{
                jogador = jogador2;
                vez = true;
            }
            System.out.println("\n#####################################");
            System.out.println("Vez de "+jogador.getNome()+"\n");
            //System.out.print("'1' Roleta / '2' Arriscar (R$ 10000): ");
            //int r = input.nextInt();
            
            // codigo de joyce
            int r = Verifica.opcao();//chama a a função verificação da class Verifica
            // fim do codigo de joyce
            
            if (r == 1){
                float dindin = palav.dinheiro();
                if (dindin == -1){
                    System.out.println("Passou a vez");
                    continue;
                }
                else if (dindin == 0){
                    System.out.println("Perdeu tudo");
                    jogador.perdeuTudo();
                    continue;
                }
                System.out.printf("Valendo R$%.2f\n",dindin);
                //System.out.print("Digite uma letra: ");
                //char ch = input.next().charAt(0);
                
                // codigo de joyce
                char ch = Verifica.caractere();//chama a a função verificação da class Verifica
                // fim do codigo de joyce
                
                System.out.println("\n-----------------------------------");
                int pontos = palav.verificaLetra(ch);
                System.out.printf("%o letra(s) '%C' encontrada(s)\n\n",pontos, ch);
                jogador.ganharPontos(pontos*dindin);
                
                if(palav.verificaFim() == 0){
                    System.out.printf("%s ficou com R$%.2f\n%s ficou com R$%.2f\n",jogador1.getNome(), jogador1.getPontos(), jogador2.getNome(), jogador2.getPontos());
                    break;
                }
                System.out.println("\nA palavra se encontra assim: "+palav.getResposta());
                System.out.printf("%s está com R$%.2f\n%s está com R$%.2f\n",jogador1.getNome(), jogador1.getPontos(), jogador2.getNome(), jogador2.getPontos());
                
            }else if(r == 2){
                System.out.print("Digite a palavra: ");
                String completo = input.next();
                
                if(palav.verificaPalavra(completo) == true){
                    jogador.ganharPontos(10000.0f);
                    System.out.printf("%s ficou com R$%.2f\n%s ficou com R$%.2f\n",jogador1.getNome(), jogador1.getPontos(), jogador2.getNome(), jogador2.getPontos());
                    break;
                }else{System.out.println("Não é essa a palavra");continue;}
                
            }
                
        }    
                            
    }
    
}
