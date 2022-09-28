package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String newMessage = sehirVer();
		System.out.println(newMessage);
		int number = topla(15,7);
		System.out.println(number);
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	
	public static int topla(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	
	public static String sehirVer() {
		return "Madrid";
	}
}
