public class Funkcijos {
    public static void main(String[] args) {
        System.out.println("suma(5, 8) = " + suma(5, 8));
        System.out.println("suma(10, 20) = " + suma(10, 20));

        int dvigubaSuma = 2 * suma(5, 10);
        System.out.println("dvigubaSuma = " + dvigubaSuma);
        isvedaBruksnelius();

        short x = 25;
        System.out.println("apkeistiZenkla(x) = " + apkeistiZenkla(x));
        isvedaBruksnelius();

        int sk1 = 28;
        short sk2 = 17;
        boolean arLyg1 = arLyginis(sk1);
        boolean arLyg2 = arLyginis(sk2);
        System.out.println("arLyg1 = " + arLyg1);
        System.out.println("arLyg2 = " + arLyg2);
        isvedaBruksnelius();
    }

    // papildomos funkcijos
    public static int suma(int x, int y) {
        int atsakymas = x + y;
        return atsakymas;
    }

    public static void isvedaBruksnelius() {
        System.out.println("-------------------");
    }

    public static short apkeistiZenkla(short sk1) {
        return (short)(sk1 * (-1));
    }

    public static boolean arLyginis(int skaicius) {
        return skaicius % 2 == 0;
    }
}
