interface Testable {
   
    void display();
}

class Test implements Testable {
    public void display() {
        System.out.println("Display method is executed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Test testObj = new Test();
        testObj.display(); 
    }
}
