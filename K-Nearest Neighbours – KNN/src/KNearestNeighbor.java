import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KNearestNeighbor {

    public  List<dataClass.Data> getKNearestNeighbors(List<dataClass.Data> data,dataClass.Data test, int k) {
    List<dataClass.Data> neighbors = new ArrayList<>(k);

    // Her verinin test verisine olan uzaklığını hesapla
    // Kullanıcının girdiği x ve y değerleri dizide olan x ve y değerlerinden farkı alınınıp daha sonra karesi alındıktan sonra toplanır.
    for (dataClass.Data d : data) {
        double distance = Math.sqrt(Math.pow(d.x - test.x, 2) + Math.pow(d.y - test.y, 2));
        d.distance = distance;
    }

    // Uzaklığa göre sırala
    Collections.sort(data, Comparator.comparing(dataClass.Data::getDistance));

    // K en yakın komşuları al
    for (int i = 0; i < k; i++) {
        neighbors.add(data.get(i));
    }

    return neighbors;
}
}
