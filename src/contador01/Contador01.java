package contador01;

/**
 *
 * @author josem
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cc = 0;
        while (cc <10 ){
            cc++;
            if( cc == 2 || cc == 3 || cc == 4 ){
                continue;  /* Usando o continue, o mesmo ao verificar a expressão acima, não irá exibir os valores
                                    referentes e continuará o fluxo normalmente */
                
            }
            if (cc == 7 ) {
                break; /* Com o comando break, o programa identificou que ao chegar a cambalhota 7 o mesmo
                            parar a execução e finalizar o laço */
            }
            System.out.println("Cambalhota " + cc);
                    
        }
    }
    
}
