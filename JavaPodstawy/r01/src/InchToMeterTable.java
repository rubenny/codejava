/*
   Program wyświetlający konwersję
   cali na metry.

   Nazwij plik InchToMeterTable.java.
*/
class InchToMeterTable {
    public static void main(String args[]) {
        double inches, meters;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // przekształca na metry
            System.out.println(inches + " cali to " +
                    meters + " metrów.");

            counter++;
            // co 12 wierszy wyświetla pusty wiersz
            if(counter == 12) {
                System.out.println();
                counter = 0; // zeruje licznik wierszy
            }
        }
    }
}
