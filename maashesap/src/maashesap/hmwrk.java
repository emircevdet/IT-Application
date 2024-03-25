package maashesap;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hmwrk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> kAdi = new ArrayList<String>();
		List<Byte> cocuk = new ArrayList<Byte>();
		List<String> mDurum = new ArrayList<String>();
		List<Integer> maas = new ArrayList<Integer>();
		byte menu;
		for (;;) {
			Metotlar.menu();
			menu = sc.nextByte();

			switch (menu) {
			case 1: {
				Metotlar.veriGir(sc, kAdi, cocuk, mDurum, maas);
				break;
			}
			case 2: {
				Metotlar.Listele(kAdi, cocuk, mDurum, maas);
				break;
			}
			case 3: {
				Metotlar.maasHesap(kAdi, cocuk, mDurum, maas);
				break;
			}
			case 4: {
				System.out.println("Aranacak adı giriniz : ");
				
				String arananAd = sc.next();
				Metotlar.Adarama(kAdi, cocuk, mDurum, maas, arananAd);
				
				break;

			}
			}

		}
	}
}