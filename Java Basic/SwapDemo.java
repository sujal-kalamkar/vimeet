public class SwapDemo {
    public static void main(String[] args) {
        int c = 0;

        int a = 0;

        int b = 1;

        while ( c<= 13){

            System.out.println(a);

            System.out.println(b);

            c= a + b;

            System.out.println(c);

            a = b;
            b = c;
        }
    }
}
