
interface Testable {
    void display();
}

abstract class AbsTest implements Testable {
}

class ConcreteTest extends AbsTest {
    public void display() {
        System.out.println("Display method in ConcreteTest is executed.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteTest testObj = new ConcreteTest();
        testObj.display();
    }
}
