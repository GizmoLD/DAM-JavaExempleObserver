import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Poligon> llista = new ArrayList<>();
        List<Poligon> llistaCopy = new ArrayList<>();

        List<Electrodomestic> llistaElectrodomestics = new ArrayList<>();
        List<Electrodomestic> llistaElectrodomesticsCopy = new ArrayList<>();

        List<Forn> llistaForn = new ArrayList<Forn>();
        List<Nevera> llistaNevera = new ArrayList<Nevera>();
        List<Rentadora> llistaRentadora = new ArrayList<Rentadora>();

        Forn forn1 = new Forn();
        forn1.nom = "Forn1";
        forn1.preu = 20;
        forn1.marca = "Sony";
        forn1.eficiencia = "A";
        llistaForn.add(0, forn1);

        Forn forn2 = new Forn();
        forn2.nom = "Forn2";
        forn2.preu = 10;
        forn2.marca = "Panasonic";
        forn2.eficiencia = "B";
        llistaForn.add(1, forn2);

        Nevera nevera1 = new Nevera();
        nevera1.nom = "Nevera1";
        nevera1.preu = 20;
        nevera1.marca = "";
        llistaNevera.add(0, nevera1);

        Nevera nevera2 = new Nevera();
        nevera2.nom = "Nevera2";
        nevera2.preu = 20;
        llistaNevera.add(1, nevera2);

        Rentadora rentadora1 = new Rentadora();
        rentadora1.nom = "Rentadora1";
        llistaRentadora.add(0, rentadora1);

        Rentadora rentadora2 = new Rentadora();
        rentadora2.nom = "Rentadora2";
        llistaRentadora.add(0, rentadora2);
        
        llistaElectrodomesticsCopy.add(0, rentadora1.clone());
        llistaElectrodomesticsCopy.add(1, forn1.clone());
        llistaElectrodomesticsCopy.add(1, nevera1.clone());



        Cercle circle = new Cercle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        llista.add(circle);

        Cercle anotherCircle = (Cercle) circle.clone();
        llista.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        llista.add(rectangle);

        // Clonar la llista
        for (Poligon obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }
    }

    static void compare (int i, Poligon a, Poligon b) {
        if (a == b) {
            System.out.println(i + ": Els poligons són el mateix objecte");
        } else {
            System.out.print(i + ": Els poligons són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els poligons són idèntics");
            } else {
                System.out.println(i + ": Els poligons NO són identics");
            }
        }
    }
}
//s s donde esta