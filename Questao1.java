import java.util.Scanner;

public class Questao1 {
	
	public int recSoma(int n)
	{
		if (n == 0) 
			return 0;
		
		return n + recSoma(n-1);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Questao1 q = new Questao1();
		System.out.println("número inteiro: ");
		int n = in.nextInt();
		int r = q.recSoma(n);
		System.out.println(r);
    }
}
