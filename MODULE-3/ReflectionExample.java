import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Load the class dynamically
        Class<?> cls = Class.forName("Sample");

        // Create an object of that class
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Get all declared methods
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method: " + method.getName());

            // Invoke if it's named "sayHello"
            if (method.getName().equals("sayHello")) {
                method.invoke(obj);
            }
        }
    }
}

// Separate file or inner class
class Sample {
    public void sayHello() {
        System.out.println("Hello from Reflection!");
    }
}
