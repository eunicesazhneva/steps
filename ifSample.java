public class ifSample {
    public static void main (String args[]){
        int x, y;
        x = 10;
        y = 20;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if (x < y) System.out.println("x меньше y");

        x = x*2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if (x == y) System.out.println("x равен y");

        x = x*2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        if (x>y) System.out.println("x теперь больше y");

    }
}
