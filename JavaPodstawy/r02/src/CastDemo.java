// Demonstruje rzutowanie.
class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // rzutuje double na int
        System.out.println("Całkowity wynik dzielenia x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Wartość zmiennej b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Wartość zmiennej b: " + b);

        b = 88; // kod ASCII litery X
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
