import java.util.List;

public class Main {

    public static void main(String[] args) {
        String nazevSouboru = "ExportObjednavek.csv";
        List<String> radky = CteniCSV.nactiCSV(nazevSouboru);
        List<String> burdaObjednavky = CteniCSV.filtrujBurdaObjednavky(radky);

        System.out.println("Burda objednávky:");
        for (String objednavka : burdaObjednavky) {
            System.out.println(objednavka);
        }
    }
}
