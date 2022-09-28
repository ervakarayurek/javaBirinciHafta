package javaIntro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba Java");

		// VARIABLES

		int sayi = 10;
		String mesaj = "Öğrenci Sayısı : ";

		System.out.println("Öğrenci sayım : " + sayi);
		System.out.println("Öğrenci sayım : 9");
		System.out.println(mesaj + sayi);

		// DATA TYPES

		char karakter = 'A';
		boolean dogruMu = true;

		// CONDITIONALS

		int number = 30;

		if (number < 30) {
			System.out.println("Sayı 30'dan küçüktür.");
		} else if (number == 30) {
			System.out.println("Sayı 30'a eşittir.");
		} else {
			System.out.println("Sayı 30'dan küçük değildir.");
		}

		// RECAP DEMO 1

		int sayi1 = 25;
		int sayi2 = 36;
		int sayi3 = 30;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı = " + enBuyuk);

		// SWİTCH DEMO

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz.");
			break;
		case 'F':
		case 'G':
			System.out.println("Maalesef kaldınız.");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}
		// FOR
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");

		// FOR ÖRNEK

		for (int i = 1; i < 20; i += 2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü sonlandı.");

		int i = 2;
		// WHILE
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While döngüsü bitti");
		// DO-WHILE
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("do-while döngüsü bitti.");

		// ARRAY

		String ogrenci1 = "Erva";
		String ogrenci2 = "Leyla";
		String ogrenci3 = "Engin";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("-------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Erva";
		ogrenciler[1] = "Leyla";
		ogrenciler[2] = "Engin";
		ogrenciler[3] = "Ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("-------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// RECAP DEMO 2

		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + max);

		// MULTIDIMENSIONAL ARRAY
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int i = 0; i <= 2; i++) {
			System.out.println("-------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

		// STRINGS

		String mesaj = "Bugün hava çok güzel.";

		System.out.println(mesaj);
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("A")); // mesaj A ile başlıyor mu?
		System.out.println(mesaj.endsWith(".")); // mesaj . ile bitiyor mu?
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("ü"));

		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 4)); // 2.karakterden itibaren 4'e kadar alır.

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // küçük harfe çeviriyor hepsini.
		System.out.println(mesaj.toUpperCase());

		String newMesaj = "    Bugün hava çok güzel.     ";
		System.out.println(newMesaj.trim());

		// ASAL SAYI

		int number = 13;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayı girildi.");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}

		// SESLİ HARFLER

		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf.");
			break;
		default:
			System.out.println("İnce sesli harf.");
		}

		// MÜKEMMEL SAYILAR

		int number = 28;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");
		}

		// ARKADAŞ SAYILAR

		int sayi1 = 220;
		int sayi2 = 284;

		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Arkadaş sayılardır.");
		} else {
			System.out.println("Arkadaş sayı değillerdir");
		}
		// SAYI BULMA

		int[] sayilarlistesi = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 5;

		boolean varMi = false;

		for (int sayim : sayilarlistesi) {
			if (sayim == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
