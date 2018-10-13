// Nieoczekiwany wynik promocji!
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, rzutowanie niepotrzebne

        b = 10;
        b = (byte) (b * b); // rzutowanie konieczne!!

        System.out.println("i oraz b: " + i + " " + b);
    }
}
