/*
   Demonstruje uzycie zmiennych.

   Nazwij plik Example2.java.
*/
class Example2 {
    public static void main(String args[]) {
        int var1; // deklaracja zmiennej
        int var2; // deklaracja kolejnej zmiennej

        var1 = 1024; // przypisanie 1024 do var1

        System.out.println("var1 zawiera " + var1);

        var2 = var1 / 2;

        System.out.print("var2 zawiera var1 / 2: ");
        System.out.println(var2);
    }
}
