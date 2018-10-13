// Wyszukuje liczby pierwsze z przedziału od 2 do 100.
class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;

        for(i=2; i < 100; i++) {
            isprime = true;

            // sprawdza czy liczba dzieli się bez reszty
            for(j=2; j <= i/j; j++)
                // jeśli tak, to nie jest liczbą pierwszą
                if((i%j) == 0) isprime = false;

            if(isprime)
                System.out.println(i + " jest liczbą pierwszą.");
        }
    }
}
