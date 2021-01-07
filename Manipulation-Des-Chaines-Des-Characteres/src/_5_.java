import java.util.Scanner;

public class _5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int lignes = sc.nextInt();
		String[] text = new String[lignes];
		sc.nextLine();
		
		for(int i = 0; i < lignes; i++) {
			text[i] = sc.nextLine();
		}
		
		for(int i = 0; i < lignes; i++) {
			String texteFinale = "";
			char caractereAvant = 'É';
			int caractereCompte = 0;
			for(int j = 0; j < text[i].length(); j++) {
				if(j == 0) {
					caractereCompte = 1;
					caractereAvant = text[i].charAt(j);
				}
				else if(text[i].charAt(j) != caractereAvant) {
					texteFinale += caractereCompte + " " + caractereAvant + " ";
					caractereCompte = 1;
					caractereAvant = text[i].charAt(j);
				}
				else {
					caractereCompte += 1;
				}
			}
			texteFinale += caractereCompte + " " + caractereAvant + " ";
			System.out.println(texteFinale);
		}
		
		sc.close();
	}

}
