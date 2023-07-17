public class Student {
    int rollnumber;
    String name;

    public Student (){

    }

    public Student (int rn, String n) {
        rollnumber = rn ;
        name = n;

    }
    public void display(){
        System.out.println(rollnumber+" "+name);
            
        }
    
    }