import java.util.Scanner;

public class _3_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int lignes = sc.nextInt();
		int[] nombreMessages = new int[lignes];
		String[] signesMessages = new String[lignes];
		sc.nextLine();

		for(int i = 0; i < lignes; i++) {
			String a = sc.nextLine();
			String[] b = a.split(" ");
			nombreMessages[i] = Integer.valueOf(b[0]);
			signesMessages[i] = b[1];
		}
		
		for(int i = 0; i < lignes; i++) {
			for(int j = 0; j < nombreMessages[i]; j++) {
				System.out.print(signesMessages[i]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
