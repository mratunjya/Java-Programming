abstract class A {
    abstract void steering();
    abstract void breaking();
}

class B extends A {
    void steering()
    {
        System.out.println("Power Steering");
    }

    void breaking()
    {
        System.out.println("Power Break");
    }
}

class C extends A {
    void steering()
    {
        System.out.println("Normal Steering");
    }

    void breaking()
    {
        System.out.println("Hydraulic Break");
    }
}

public class AbstractClass {
    public static void main(String args[]) {
        B ob1 = new B();
        C ob2 = new C();

        ob1.steering();
        ob1.breaking();

        ob2.steering();
        ob2.breaking();
    }
}
