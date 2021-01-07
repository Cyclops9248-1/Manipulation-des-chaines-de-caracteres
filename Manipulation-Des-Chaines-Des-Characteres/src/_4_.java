import java.util.Scanner;

public class _4_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int spaces = sc.nextInt();
		sc.nextLine();
		String jour1 = sc.nextLine();
		String jour2 = sc.nextLine();
		
		int ocCount = 0;
		for(int i = 0; i < spaces; i++) {
			if(jour1.charAt(i) == 'C' && jour2.charAt(i) == 'C') {
				ocCount += 1;
			}
		}
		
		System.out.println(ocCount);
		sc.close();
	}

}
