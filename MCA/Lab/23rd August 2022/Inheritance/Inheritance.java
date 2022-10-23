class InheritanceA {
    void display() {
        System.out.println("My class name is InheritanceA");
    }
}

class InheritanceB extends InheritanceA {
    void display() {
        super.display();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        InheritanceA obj = new InheritanceB();
        obj.display();
    }
}
