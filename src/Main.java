import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String cesta = "C:\\Users\\dpivo\\Documents\\GitHub\\Zadani_2\\geo_coded_DM_jaro_2024.csv";
        Set<String> data = CteniCSV.nactiCSV(cesta);

        for (String radek : data) {
            for (String hodnota : radek) {
                System.out.print(hodnota + " ");
            }
            System.out.println();
        }
    }
}