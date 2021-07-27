package pakiettestowy;

public class Main {

    public static void main(String[] args) {
        System.out.println(pogoda());
        System.out.println(kolo());
    }
    public static String pogoda() {
        String prognoza = "Prognoza pogody";
        System.out.println(prognoza);
        int temperature = 33;
        if (temperature < 10) {
            System.out.println("Jest zimno");
        } else if (temperature < 20) {
            System.out.println("Jest ciepło");
        } else if (temperature < 30) {
            System.out.println("Jest gorąco");
        } else {
            System.out.println("Bardzo gorąco");
        }
        String koniec = ("Ubierz się odpowiednio");
        return koniec;
    }
    public static String kolo() {
        String poleobwodkola = ("Metoda licząca pole i obwód koła");
        System.out.println(poleobwodkola);
        int promienKola = 8;
        double pi = 3.14;
        double poleKola = pi * promienKola * promienKola;
        double obwodKola = 2 * pi * promienKola;
        System.out.println("Pole kola wynosi: " + poleKola);
        System.out.println("Obwod kola wynosi: " + obwodKola);
        return "koniec programu";
    }
    
}
