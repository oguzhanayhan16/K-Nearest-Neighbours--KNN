import java.util.List;

public class DisplayHelper {
    public  String result(List<dataClass.Data> neighbors) {
        // Komşuların sınıflarını say
        int countA = 0;
        int countB = 0;
        for (dataClass.Data n : neighbors) {
            if (n.character.equals("A")) {
                countA++;
            } else if (n.character.equals("B")) {
                countB++;
            }
        }

        // Sınıfı belirle
        if (countA > countB) {
            return "A";
        } else {
            return "B";
        }
    }
}
