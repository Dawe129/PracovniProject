import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CteniCSV {

    public static void vypisBurdaObjednavky(String nazevSouboru) {
        try (BufferedReader br = new BufferedReader(new FileReader(nazevSouboru))) {
            String radek;
            while ((radek = br.readLine()) != null) {
                String[] sloupce = radek.split(";");
                if (sloupce.length > 14 && sloupce[14].startsWith("\"Burda")) {
                    System.out.println(radek);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
