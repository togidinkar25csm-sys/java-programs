package inheritance;

abstract public class Base {

    int x = 10;

    void sayMyName() {
        System.out.println("My name is Togi Dinkar");
    }

    abstract void sayMyAge();
}


public class ranger extends Base {

     
    void sayMyAge() {
        System.out.println("My age in subclass is: 19");
    }

    
    public static void main(String[] args) {

    	 Ranger   ad = new   Ranger();

        System.out.println("Value of x: " + ad.x);
        ad.sayMyName();
        ad.sayMyAge();
    }
}
