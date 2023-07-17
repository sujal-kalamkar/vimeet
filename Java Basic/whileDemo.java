public class whileDemo {
    public static void main(String[] args) {
        int i = 1;

        while (i <=10) {

            int square = i * i;
            int cube = i * i * i;

            System.out.println(i + "  " + square + "  " + cube);

            i++;
        }
    }
}
