interface A {
    default void show() {
        System.out.println("Default method");
    }

    static void display() {
        System.out.println("Static method");
    }
}

public class method_interface {
    public static void main(String[] args) {
        A obj = new A() {}; 

        obj.show();    
        A.display();    
    }
}
