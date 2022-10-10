import java.util.Scanner;
public class Questao1Fila {
	public static void main(String args[]){		
		Scanner in = new Scanner(System.in);
		
        Fila f1 = new Fila(5);
        Fila f2 = new Fila(5);
        
        boolean inserirNovosChars = true;
        
        while(inserirNovosChars) {
        	System.out.println("Digite um caractere");
        	String c = in.nextLine();
        	if(c.isEmpty()) {
        		inserirNovosChars = false;	
        	}
        	else {
        		char chc = c.charAt(0);
        		if(Character.isLetter(chc))
        		{
        			if(Character.isLowerCase(chc)) {
        				f2.push(chc);
        			}
        			else {
        				f1.push(chc);
        			}
        		}
        	}
        }
        
    	System.out.println("removendo itens da fila");
    	
    	System.out.println("maiuscula");
    	
    	int tf1 = f1.size();
    	int tf2 = f2.size();
    	
    	for(int i=0; i < tf1; i++) {
    		System.out.println("removendo: " + f1.front());
    		f1.pop();
    	}
    	
    	System.out.println("");
    	
    	System.out.println("minuscula");
    	
    	for(int i=0; i < tf2; i++) {
    		System.out.println("removendo: " + f2.front());
    		f2.pop();
    	}
    }
}
