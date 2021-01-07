import java.util.Scanner;

public class _1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int[] resultats = new int[6];
		for(int i = 0; i < 6; i++) {
			int n = sc.nextInt();
			resultats[i] = n;
		}
		
		int scoreA = resultats[0] * 3 + 
				resultats[1] * 2 + 
				resultats[2];
		
		int scoreB = resultats[3] * 3 + 
				resultats[4] * 2 + 
				resultats[5];
		
		if(scoreA == scoreB) System.out.println("T");
		if(scoreA > scoreB) System.out.println("A");
		if(scoreA < scoreB) System.out.println("B");
		
		sc.close();
	}

}
