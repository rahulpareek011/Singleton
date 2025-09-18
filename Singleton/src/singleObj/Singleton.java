package singleObj;

// Singleton class ensures that only ONE object (instance) of the class
// can ever be created and used throughout the application.
public class Singleton {
    
    // Instance variable (just for testing, we keep some data here)
    int id = 100;
    
    // Step 1: Create a private static reference of the same class.
    // Initially, it's null because no object is created yet.
    private static Singleton a = null;
    
    // Step 2: Make the constructor PRIVATE
    // -> This prevents creating an object using "new Singleton()" from outside the class.
    private Singleton() {}
    
    // Step 3: Provide a public static method to get the single object.
    // -> This method controls object creation.
    public static Singleton single() {
        // If no object is created yet, create one.
        if (a == null) {
            a = new Singleton();
        }
        // If already created, just return the existing one.
        return a;
    }
    
    
    public static void main(String[] args) {
        // Getting the singleton object using the static method "single()"
        Singleton a = single();
        Singleton b = single();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        
        // Printing the id variable to show the object is working
        System.out.println(a.id);
    }
}
