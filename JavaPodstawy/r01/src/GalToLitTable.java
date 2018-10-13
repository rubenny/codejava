/*
   Program wywietla tabele zamiany
   galonow na litry.

   Nazwij plik "GalToLitTable.java".
*/
class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // zamiana na litry
            System.out.println(gallons + " galonow to " +
                    liters + " litrow.");

            counter++;
            // co dziesiety wiersz wyswietla pusty wiersz (odstep)
            if(counter == 10) {
                System.out.println();
                counter = 0; // zeruje licznik wierszy
            }
        }
    }
}
