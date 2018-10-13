/*
   Program zamieniaj¹cy galony na litry.

   Nazwij ten program GalToLit.java.
*/
class GalToLit {
    public static void main(String args[]) {
        double gallons; // przechowuje liczbê galonów
        double liters;  // przechowuje liczbê litrów (po zamianie)

        gallons = 10; // 10 galonów

        liters = gallons * 3.7854; // zamienia na litry

        System.out.println(gallons + " galonów odpowiada " + liters + " litrom.");
    }
}
