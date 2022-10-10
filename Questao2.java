import java.util.Scanner;

public class Questao2 {
	
	public int numeroNaturais(int n, int init) {
		if(n == -1) {
			return 0;
		}
		int r = 1 + numeroNaturais(n - 1, init);
		if(r <= init)
			System.out.println(r);
		return r;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Questao2 q = new Questao2();
		System.out.println("número inteiro: ");
		int n = in.nextInt();
		q.numeroNaturais(n, n);
    }

}
