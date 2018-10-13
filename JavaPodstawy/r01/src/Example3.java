/*
   Program ilustruje różnice
   pomiędzy int i double.

   Nazwij plik Example3.java.
*/
class Example3 {
    public static void main(String args[]) {
        int var;  // deklaracja zmiennej typu int
        double x; // deklaracja zmiennej typu double

        var = 10; // przypisuje zmiennej var wartość 10

        x = 10.0; // przypisuje zmiennej x wartość 10.0

        System.out.println("Początkowa wartość zmiennej var: " + var);
        System.out.println("Początkowa wartość zmiennej x: " + x);

        System.out.println(); // wyświetla pusty wiersz

        // dzieli wartość obu zmiennych przez 4
        var = var / 4;
        x = x / 4;

        System.out.println("var po dzieleniu: " + var);
        System.out.println("x po dzieleniu: " + x);
    }
}