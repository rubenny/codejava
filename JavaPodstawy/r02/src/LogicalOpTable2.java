public class LogicalOpTable2 {

    public static void main(String args[]) {

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        printValues();
    }

    private static void printValues()
    {
        boolean p;
        boolean q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) +"\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));

        p = true; q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) +"\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));

        p = false; q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) +"\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));

        p = false; q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) +"\t");
        System.out.print(boolToInt(p&q) + "\t" + boolToInt(p|q) + "\t");
        System.out.println(boolToInt(p^q) + "\t" + boolToInt(!p));
    }

    private static int boolToInt(boolean b)
    {
        return (b) ? 1 : 0;
    }
}