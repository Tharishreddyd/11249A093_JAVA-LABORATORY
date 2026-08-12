class Animal {
    String name = "Dog";
    void eat() {
        System.out.println(name + " eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println(name + " barks.");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Animal Name: " + d.name);
        d.eat();
        d.bark();
    }
}