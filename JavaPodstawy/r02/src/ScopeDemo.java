// Demonstruje zasięg bloku.
class ScopeDemo {
    public static void main(String args[]) {
        int x; // widoczna w całym kodzie metody  main

        x = 10;
        if(x == 10) { // początek nowego zasięgu
            int y = 20; // widoczna tylko w tym bloku

            // tutaj widoczne x i y
            System.out.println("x i y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // błąd! y nie jest tu widoczne

        // x jest tu nadal widoczne
        System.out.println("x jest " + x);
    }
}
