
interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Squeakable {
    void squeak();
}

interface Swimmable {
    void swim();
}

abstract class Duck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }
}

class RubberDuck extends Duck implements Squeakable {
    @Override
    public void squeak() {
        System.out.println("Squeak!");
    }
}

class WoodenDuck extends Duck {
 
}

class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("I am flying.");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

class LakeDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("I am flying.");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.swim();   
        ((RubberDuck) rubberDuck).squeak(); 
        
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.swim();   

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();  
        ((RedHeadDuck) redHeadDuck).fly(); 
        ((RedHeadDuck) redHeadDuck).quack();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.swim();    
        ((LakeDuck) lakeDuck).fly(); 
        ((LakeDuck) lakeDuck).quack(); 
    }
}
