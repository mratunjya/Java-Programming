public class Person
{
    String name;
    int age;

    Person()
    {
        System.out.println("Default Constructor");
    }

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void SetName(String n)
    {
        name = n;
    }

    void SetAge(int a)
    {
        age = a;
    }

    String GetName()
    {
        return name;
    }

    int GetAge()
    {
        return age;
    }

    public static void main(String args[])
    {
        Person ob1 = new Person();
        Person ob2 = new Person("MHS", 21);

        ob1.SetName("Mratunjya Shankhdhar");
        ob1.SetAge(21);

        String name = ob1.GetName();
        int age = ob1.GetAge();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
