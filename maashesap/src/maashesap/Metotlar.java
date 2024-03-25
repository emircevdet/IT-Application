package maashesap;

import java.util.List;
import java.util.Scanner;

public class Metotlar {

	public static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1-Kayıt");
		System.out.println("2-Listeleme:");
		System.out.println("3-Maaşhesapla");
		System.out.println("4-Arama");
	}

	public static void veriGir(Scanner sc, List<String> kAdi, List<Byte> cocuk, List<String> mDurum,
			List<Integer> maas) {
		// TODO Auto-generated method stub
		System.out.println("isim:");
		kAdi.add(sc.next());
		System.out.println("Çocuk sayısı:");
		cocuk.add(sc.nextByte());
		System.out.println("Medeni durumu:");
		mDurum.add(sc.next());
		System.out.println("Maaşı:");
		maas.add(sc.nextInt());

	}

	public static void Listele(List<String> kAdi, List<Byte> cocuk, List<String> mDurum, List<Integer> maas) {
		// TODO Auto-generated method stub
		for (int i = 0; i < kAdi.size(); i++) {
			yazdir(i, cocuk.get(i), mDurum.get(i), maas.get(i));
		}

	}

	private static void yazdir(int i, Byte velet, String medeni, Integer maas1) {
		// TODO Auto-generated method stub
		System.out.println("isim:" + i);
		System.out.println("çocuk sayısı:" + velet);
		System.out.println("medeni durum:" + medeni);
		System.out.println("maaş:" + maas1);

	}

	public static void maasHesap(List<String> kAdi, List<Byte> cocuk, List<String> mDurum, List<Integer> maas) {
		// TODO Auto-generated method stub
		for (int i = 0; i < kAdi.size(); i++) {
			int guncelMaas = maas.get(i);
			guncelMaas += 500 * cocuk.get(i); // Her çocuk için 500 ekstra
			if (mDurum.get(i) != null) {
				guncelMaas += 1000; // Eğer evliyse ekstra 1000
			}

			System.out.println("İsmi: " + kAdi.get(i));
			System.out.println("Güncel Maaşı: " + guncelMaas);
			System.out.println("Çocuk Sayısı: " + cocuk.get(i));
			System.out.println("Medeni Durumu: " + (mDurum.get(i) != null ? "Evli" : "Bekar"));
		}
	}

	public static void Adarama(List<String> kAdi, List<Byte> cocuk, List<String> mDurum, List<Integer> maas, String arananAd) {
		// TODO Auto-generated method stub
		for (int i = 0; i < kAdi.size(); i++) {
			if (kAdi.get(i).equalsIgnoreCase(arananAd)) {
				yazdir(i, cocuk.get(i), mDurum.get(i), maas.get(i));
			} 
			
		}
		
				
	}

}
