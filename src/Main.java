import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String nazevSouboru = "ExportObjednavek.csv"; // Zňte na skutečný název souboru
        Set<String> burdaObjednavky = CteniCSV.nactiBurdaObjednavky(nazevSouboru);
        System.out.println("Burda objednávky:");
        for (String objednavka : burdaObjednavky) {
            System.out.println(objednavka);
        }
    }
}
