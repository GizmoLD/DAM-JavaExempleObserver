import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Electrodomestic> llistaElectrodomestics = new ArrayList<>();
        List<Electrodomestic> llistaElectrodomesticsCopy = new ArrayList<>();


        Forn forn1 = new Forn();
        forn1.nom = "Forn1";
        forn1.preu = 20;
        forn1.marca = "Sony";
        forn1.eficiencia = "A";
        llistaElectrodomestics.add(forn1);

        Forn forn2 = new Forn();
        forn2.nom = "Forn2";
        forn2.preu = 10;
        forn2.marca = "Panasonic";
        forn2.eficiencia = "B";
        llistaElectrodomestics.add(forn2);

        Nevera nevera1 = new Nevera();
        nevera1.nom = "Nevera1";
        nevera1.preu = 20;
        nevera1.marca = "Taurus";
        nevera1.eficiencia = "C";
        llistaElectrodomestics.add(nevera1);

        Nevera nevera2 = new Nevera();
        nevera2.nom = "Nevera2";
        nevera2.preu = 20;
        nevera2.marca = "Apple";
        nevera2.eficiencia = "B";
        llistaElectrodomestics.add(nevera2);

        Rentadora rentadora1 = new Rentadora();
        rentadora1.nom = "Rentadora1";
        rentadora1.preu = 100;
        rentadora1.marca = "Samsung";
        rentadora1.eficiencia = "C";
        llistaElectrodomestics.add(rentadora1);

        Rentadora rentadora2 = new Rentadora();
        rentadora2.nom = "Rentadora2";
        rentadora2.preu = 200;
        rentadora2.marca = "Steam";
        rentadora2.eficiencia = "Z";
        llistaElectrodomestics.add(rentadora2);

        llistaElectrodomesticsCopy.add(rentadora1.clone());
        llistaElectrodomesticsCopy.add(rentadora2.clone());
        llistaElectrodomesticsCopy.add(forn1.clone());
        llistaElectrodomesticsCopy.add(forn2.clone());
        llistaElectrodomesticsCopy.add(nevera1.clone());
        llistaElectrodomesticsCopy.add(nevera2.clone());

        for (int i = 0; i < llistaElectrodomestics.size(); i++) {
            compare(i, llistaElectrodomestics.get(i), llistaElectrodomestics.get(i));
        }

        for (int i = 0; i < llistaElectrodomestics.size(); i++) {
            compare(i, llistaElectrodomestics.get(i), llistaElectrodomesticsCopy.get(i));
        }
    }

    static void compare(int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomèstics  són el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomèstics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomèstics són idèntics");
            } else {
                System.out.println(i + ": Els electrodomèstics NO són identics");
            }
        }
    }
}
