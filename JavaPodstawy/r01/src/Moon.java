/*
   Oblicza Twój ciężar na Księżycu.

   Nazwij ten plik Moon.java.
*/
class Moon {
    public static void main(String args[]) {
        double earthweight; // ciężar na Ziemi
        double moonweight; // ciężar na Księżycu

        earthweight = 92;

        moonweight = earthweight * 0.17;

        System.out.println(earthweight + " kilogramów na Ziemi to " +
                moonweight + " kilogramów na Księżycu.");

    }
}
