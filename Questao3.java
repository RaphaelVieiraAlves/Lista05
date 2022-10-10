import java.util.Scanner;

public class Questao3 {
	
	public int p(int k, int n) {
		if(n == 1) {
			return k;
		}
		return k * p(k, n - 1);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Questao3 q =  new Questao3();
		System.out.println(" número k: ");
		int k = in.nextInt();
		System.out.println("número n: ");
		int n = in.nextInt();
		int r = q.p(k, n);
		System.out.println(r);
    }
}
