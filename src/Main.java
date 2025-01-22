public class Main {
    public static void main(String[] args) {

        // deklaracija
        byte a2 = -54;
        // definicija
        short x = 2;
        int myWidth;
        long myHeight = 21279912;
        // inicjalizacija
        myWidth = 5252;
        float decimalni = 3.12323F;
        double decimalni2 = 3.12323;
        char znak = '\u0041';
        char znak1 = 'B';

        boolean znak2 = znak == znak1;

        System.out.println(x + myWidth);
        System.out.println(x + myWidth);
        System.out.println(x - myWidth);
        System.out.println(x * myWidth);
        System.out.println(x / myWidth); // cijeloborjno dijeljenje
        System.out.println(x % myWidth); // dijeljenje s ostatkom
        System.out.println((float)x / myWidth);

        System.out.println("float + double = " + (decimalni + decimalni2));
        System.out.println("float - double = " + (decimalni - decimalni2));
        System.out.println("float % double = " + (decimalni % decimalni2));
        System.out.println("float * double = " + (decimalni * decimalni2));
        System.out.println("float / double = " + (decimalni / decimalni2));

        System.out.println("double / byte = " + (decimalni2 / a2));
        System.out.println("float + int = " + (decimalni / myWidth));
        System.out.println("long % float = " + (myHeight / decimalni));
        System.out.println("int * short = " + (myWidth / x));

        System.out.printf("Printf double / long = %f%n", decimalni2 / myHeight);
        System.out.printf("Printf long %% int = %d%n", myHeight % myWidth);

        System.out.println("znak = " + znak);
        System.out.printf("Printf znak1 = %c%n", znak1);

        System.out.println("znak and znak1 su jednake -> " + znak2);

        int baze = 2211;
        int algoritimi = 66;
        int praktikum = 3;
        int osnove = 3;
        double prosjek = (double) (baze + algoritimi + praktikum + osnove) / 4;

        System.out.println("Prosjek je " + prosjek);
        System.out.println("Zaokruzen prosjek " + Math.round(prosjek));
        System.out.println("Broj PI " + Math.PI);
        System.out.println("Broj E " + Math.E);

        // Exercise
        System.out.println("10 na 3 je = " + Math.pow(10.0, 3));
        System.out.println("Zaokruzen broj E = " + Math.round(Math.E));
        System.out.println("Korijen od 400 = " + Math.sqrt(400));
        System.out.println("Zaokruzen E broj na 2 decimale = " + Math.round(Math.E * 100) / 100.0f);

        // Homework - 1
        int a = 12;
        int b = 45;
        int zbroj = a + b;
        System.out.println("Zboj broja a=" + a + " i broja b=" + b + " jednak je c=" + zbroj);

        // Homework - 2
        System.out.println("Bruno\tPodrug\n\nSplit");

        // Homework - 3
        float side1 = 3.4f;
        float side2 = 7.39f;
        double hipotenuza = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Duljina hipotenuze trokuta je = " + hipotenuza);
    }
}