package puresingleton;

public class Singleton {
    private static final Singleton instance = new Singleton(); // create the singleton instance

    private Singleton() {
        // private constructor to prevent instantiation from outside the class
    }

    public static Singleton getInstance() {
        return instance; // return the singleton instance
    }
}
