public class Array {
    public static void main(String[] args) {
        
        int[] numbers = { 23, 9, 34, 10, 8};

        int max = numbers[0];

        int size = numbers.length;

        for (int i = 0; i < size; i++){
            if(numbers[i] > max){

                max = numbers[i];
            }
    
        }
        System.out.println("Max number is : " + max);
    }
}
