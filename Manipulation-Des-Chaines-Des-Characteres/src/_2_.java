import java.util.Scanner;

public class _2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int compte = 0; 
		int joyeuseCompte = 0;
		int tristeCompte = 0;

		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ':' && compte == 0) {
				compte = 1;
			}
			else if(text.charAt(i) == '-' && compte == 1) {
				compte = 2;
			}
			else if(text.charAt(i) == ')' && compte == 2) {
				compte = 0;
				joyeuseCompte += 1;
			}
			else if(text.charAt(i) == '(' && compte == 2) {
				compte = 0;
				tristeCompte += 1;
			}
			else {
				compte = 0;
			}
		}
		
		if(joyeuseCompte == 0 && tristeCompte == 0) System.out.println("aucune:1");
		else if(joyeuseCompte > tristeCompte) System.out.println("joyeuse");
		else if(joyeuseCompte < tristeCompte) System.out.println("triste");
		else System.out.println("incertaine");
		
		sc.close();
	}

}
