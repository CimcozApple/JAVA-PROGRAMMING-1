import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Bir say� giriniz: ");
		int sayi=scan.nextInt();
		scan.nextLine();
		
		while(true) {
			
			System.out.println("Hangi i�lemin yapmak istersiniz. (+, -, /, *, q)");
			String islem=scan.nextLine();
			if(islem.equals("q")) {
				break;
			}
			
			System.out.print("Bir say� giriniz: ");
			int sayi2=scan.nextInt();
			scan.nextLine();
			
			if(islem.equals("+")) {
				sayi+=sayi2;
			}else if(islem.equals("-")) {
				sayi-=sayi2;
			}else if(islem.equals("/")) {
				sayi/=sayi2;
			}else if(islem.equals("*")) {
				sayi*=sayi2;
			}
		}
		System.out.println("Sonuc: "+sayi);
	}
}
