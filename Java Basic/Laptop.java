public class Laptop {
    
    int hardDisk;
    String name;
    float price;
    int ram;

    public void displayMovie(){

        System.out.println("Running one movie on" +name);
    }
    public void playSong(){

    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();

        laptop1.hardDisk = 512 ;
        laptop1.name ="lenovo";
        laptop1.price = 500000.00f;
        laptop1.ram = 8 ;

        laptop1.displayMovie();
    }
}
