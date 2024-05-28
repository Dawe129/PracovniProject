import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CteniCSV {
    public static Set<String> nactiCSV(String cesta) {
        Set<String> data = new HashSet<>();
        String radek;
        String oddelovac = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(cesta))) {
            while ((radek = br.readLine()) != null) {
                String[] hodnoty = radek.split(oddelovac);
                data.add(hodnoty[13]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    public static Set<String> nactiBurdaObjednavky(String nazevSouboru) {
        Set<String> objednavky = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nazevSouboru))) {
            String radek;
            while ((radek = br.readLine()) != null) {
                String[] sloupce = radek.split(",");
                if (sloupce[13].startsWith("Burda")) { // předpokládáme, že druhý sloupec je značka
                    objednavky.add(sloupce[0]); // předpokládáme, že první sloupec je ID objednávky
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objednavky;
    }
}
