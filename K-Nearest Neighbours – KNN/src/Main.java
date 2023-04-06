import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Örnek veri kümesi

        float x,y;

        Scanner scan = new Scanner(System.in);
        List<dataClass.Data> data = new ArrayList<>(); // Veri sınıfı
        KNearestNeighbor kn = new KNearestNeighbor();
        DisplayHelper dh= new DisplayHelper();


        data.add(new dataClass.Data(1.0, 2.0, "A"));
        data.add(new dataClass.Data(2.0, 3.0, "A"));
        data.add(new dataClass.Data(3.0, 4.0, "A"));
        data.add(new dataClass.Data(4.0, 5.0, "B"));
        data.add(new dataClass.Data(5.0, 6.0, "B"));
        data.add(new dataClass.Data(6.0, 7.0, "B"));

       System.out.println("x değerini giriniz.");
        x = scan.nextInt();
        System.out.println("y değerini giriniz.");
        y = scan.nextInt();
        // Test verisi
        dataClass.Data test = new dataClass.Data(x, y, null);

        // KNN algoritması
        int k = 3; // K sayısı
        List<dataClass.Data> neighbors = kn.getKNearestNeighbors(data, test, k);     // K en yakın komşuyu döndüren metod

        // Sınıflandırma
        String result = dh.result(neighbors);   // Sınıflandırma yapacak olan metod
        System.out.println("Test verisi sınıflandırıldı: " + result);
    }
}


