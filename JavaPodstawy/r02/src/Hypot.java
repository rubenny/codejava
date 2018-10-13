/*
   Stosuje twierdzenie Pitagorasa
   do obliczenia przeciwprostokątnej
   znając dlugość przyprostokątnych.
*/
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Przeciwprostokątna wynosi " + z);
    }
}
