import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* List<String> adlar = new ArrayList<>();

        adlar.add("Ali");
        System.out.println(adlar);
        adlar.add("Ayşe");
        System.out.println(adlar);
        adlar.add("Mehmet");
        System.out.println(adlar);//Listenin tümü
        System.out.println(adlar.get(1));//belirtilen indeks değeri
        System.out.println(adlar.getFİrst());
        System.out.println(adlar.getLast());
        adlar.add(1, "Nurşen");
        System.out.println(adlar);
        adlar.set(1, "Nurten");



        * System.out.println(adlar);
        * silinen = adlar.remove(1);
        * System.out.println("Silinen:"+silinen+"Liste"+adlar);
        * =adlar.remove("Ali"); System.out.println("Durum:"+durum+"Liste"+adlar);
        * adlar.clear();//Tüm listeyi siler System.out.println("Liste"+adlar);


        System.out.println("Liste"+adlar);
        System.out.println("adlar.contains(nurten):"+adlar.contains("nurten"));
        System.out.println("adlar.contains(ayten);"+adlar.contains("ayten"));
        System.out.println("adlar.indexOf(nurten):"+adlar.indexOf("nurten");
        System.out.println("adlar.lastindexOf(Nurten):"+adlar.lastIndexOf("Nurten");
        System.out.println("adlar.indexOf(Nurten):"+ adlar.indexOf("nurten");
        System.out.println(adlar.size());
        System.out.println(adlar.toString());
        System.out.println("----------");
        for (String ad: adlar) {
            System.out.println(ad);

        }
        System.out.println("----------");
        for (int i = 0; i < adlar.size(); i++) {
            System.out.println(adlar.get(i));

        }
        System.out.println("----------");
        adlar.sort(Comparator.reverseOrder());
        System.out.println(adlar); */
        List<Integer> sayilar = Arrays.asList(10,1,-20,40,5,-23,0);
        System.out.println(sayilar);
        System.out.println(sayilar.get(4));
        System.out.println(sayilar.size());
        sayilar.sort(null);
        System.out.println(sayilar);
        int toplam = OrtlamaAl(sayilar);
        for (int i = 0; i < sayilar.size()-1; i++) {
            System.out.println(sayilar.get(i)+"+");

        }
        System.out.println(sayilar.get(sayilar.indexOf(sayilar.get(sayilar.size()-1)))+"="+toplam);
        System.out.println("Ortalaması:"+(toplam/sayilar.size()));







    }

    private static int OrtlamaAl(List<Integer> sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);

        }
        return toplam;
    }
}