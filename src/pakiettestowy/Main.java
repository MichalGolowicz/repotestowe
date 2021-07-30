package pakiettestowy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(witaj());
        System.out.println(pogoda());
    }
    public static String pogoda() {
        String prognoza = "Prognoza pogody";
        System.out.println(prognoza);
        System.out.println("Ile jest stopni na zewnątrz?");
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        if (temperature < 20) {
            System.out.println("Jest zimno");
        } else if (temperature < 25) {
            System.out.println("Jest ciepło");
        } else if (temperature < 30) {
            System.out.println("Jest gorąco");
        } else {
            System.out.println("Bardzo gorąco");
        }
        String koniec = ("Ubierz się odpowiednio");
        return koniec;
    }


    public static String witaj() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String firstName = scan.nextLine();
        System.out.println("Witaj " + firstName);
        System.out.println("Ile masz lat?");
        int lata = scan.nextInt();
        if (lata < 11) {
            System.out.println("Jesteś jeszcze dzieckiem");}
        else if (lata >=11 && lata<18) {
            System.out.println("Jesteś nastolatkiem");}
        else
             if (firstName.endsWith("a")){
                 System.out.println("Jesteś już dorosła");}
             else {
                 System.out.println("Jesteś już dorosły");}
        return "";
    }
    }
