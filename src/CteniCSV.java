import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CteniCSV {

    public static List<String> nactiCSV(String nazevSouboru) {
        List<String> radky = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nazevSouboru))) {
            String radek;
            while ((radek = br.readLine()) != null) {
                radky.add(radek);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return radky;
    }

    public static List<String> filtrujBurdaObjednavky(List<String> radky) {
        List<String> burdaObjednavky = new ArrayList<>();
        for (String radek : radky) {
            String[] sloupce = radek.split(";");
            if (sloupce.length > 14 && sloupce[14].startsWith("\"Burda")) {
                burdaObjednavky.add(radek);
            }
        }
        return burdaObjednavky;
    }
}