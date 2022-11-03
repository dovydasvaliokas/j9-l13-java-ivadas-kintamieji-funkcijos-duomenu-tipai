public class DuomenuTipuKonvertavimas {
    public static void main(String[] args) {
        // Iš mažesnio į didesnį (implicit casting)
        short sk1 = 25;
        int sk2 = sk1;
        double sk3 = sk2;

        System.out.println("sk1 = " + sk1);
        System.out.println("sk2 = " + sk2);
        System.out.println("sk3 = " + sk3);

        // Iš didesnio į mažesnį (explicit casting)
        int sk4 = 1050;
        short sk5 = (short)sk4;

        System.out.println("sk4 = " + sk4);
        System.out.println("sk5 = " + sk5);

        int sk6 = 9956;
        byte sk7 = (byte)sk6;

        System.out.println("sk6 = " + sk6);
        System.out.println("sk7 = " + sk7);

        // Konvertuoti skaičių į raidę
        int x = 132;
        char raide = (char)x;

        System.out.println("x = " + x);
        System.out.println("raide = " + raide);

        char raide2 = 'a';
        char raide3 = 'b';
        int skaiciusRaide1 = raide2;
        int skaiciusRaide2 = raide3;

        System.out.println("raide2 = " + raide2);
        System.out.println("raide3 = " + raide3);
        System.out.println("skaiciusRaide1 = " + skaiciusRaide1);
        System.out.println("skaiciusRaide2 = " + skaiciusRaide2);


        // Konvertuoti iš teksto (String) į skaičių
        String tekstas = "256";
        short skaicius = Short.parseShort(tekstas);
        int skaicius2 = Integer.parseInt(tekstas + "458");

        System.out.println("tekstas = " + tekstas);
        System.out.println("skaicius = " + skaicius);
        System.out.println("skaicius2 = " + skaicius2);
    }
}
