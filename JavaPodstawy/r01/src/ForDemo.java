/*
  Demonstruje pętlę for.

  Nazwij plik ForDemo.java.
*/
class ForDemo {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 5; count = count+1)
            System.out.println("Wartość zmiennej sterującej count: " + count);

        System.out.println("Pętla wykonana!");
    }
}
