/*
  Demonstruje blok kodu.

  Nazwij plik BlockDemo.java.
*/
class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 5;
        j = 10;

        // instrukcja warunkowa decyduje o wykonaniu bloku kodu
        if(i != 0) {
            System.out.println("i nie jest równe zero");
            d = j / i;
            System.out.print("j / i równa się " + d);
        }
    }
}
