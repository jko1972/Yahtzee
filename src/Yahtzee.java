import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Yahtzee {

	public static void main(String[] args) {
		
		System.out.println("Welkom bij een eenvoudig Yahtzeespel.");
		System.out.println("door Koevoets development.");
		System.out.println();
		System.out.println();
		
		Yathzeespel spel = new Yathzeespel();
		spel.spelen();

	}

}

class Yathzeespel{
	
	
	
	void spelen() {
		
		ArrayList<Dobbelsteen> stenen = new ArrayList<Dobbelsteen>();
				for(int a = 0; a<5; a++) {
			Dobbelsteen steen = new Dobbelsteen();
			stenen.add(steen);
		}
			
				
		for(int worpnummer = 1; worpnummer<100; worpnummer++) {		
			
			System.out.println("Druk op enter om te gooien of 'q' gevolgd door enter om het spel te beëindigen.");
			Scanner sc = new Scanner(System.in);
			String invoer = sc.nextLine();
			
			if (worpnummer==1) {
			System.out.println("Worp"+worpnummer);
			System.out.println("1 2 3 4 5");
					
			int worpgeschiedenis[]={0,0,0,0,0};	
				for(int a = 0; a<5; a++) {
					
					worpgeschiedenis[a]=stenen.get(a).werpen();
					System.out.print(worpgeschiedenis[a]+" ");
					
								
				}
					
				} else if (worpnummer>=1) {
					
					System.out.println("Worp"+worpnummer);
					System.out.println("1 2 3 4 5");
					for(int a = 0; a<5; a++) {
						
						System.out.print(stenen.get(a).werpen()+" ");
					
					}
					
								
				
				
			}
			System.out.println();	
			System.out.println();
			
			vasthouden();
		}
	}
	
	void vasthouden() {
		
		System.out.println("Welke dobbelstenen wilt u vasthouden? (Voer bijvoorbeeld in 134, gevolgd door enter.)");
		Scanner sc2 = new Scanner(System.in);
		String invoer2 = sc2.nextLine();
		int vasthouden = Integer.parseInt(invoer2);
		int blokkeer[]= {0,0,0,0,0};
		for (int a=0;a<invoer2.length();a++) {
			int positie = Integer.parseInt(invoer2.substring(a,a+1)) -1;
			blokkeer[positie] = 1;
		}
		
	}
	
}

class Dobbelsteen{
	
	int werpen() {
		
		int dobbel;
		Random random = new Random();
		dobbel = random.nextInt(6) + 1;
		return dobbel;
		
	}
	
}