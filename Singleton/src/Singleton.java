public class Singleton {

    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton(){}

    //create an object of SingleObject
    private static Singleton instance = new Singleton();

    //Get the only object available
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
