package exo2_1;

public class Test {

    public static void main(String[] args) {

        Person p = new Person();
        p.sayHello();

        Student s = new Student();
        s.setAge(15);
        s.sayHello();
        s.goToClasses();
        s.displayAge();

        Teacher t = new Teacher();
        t.setAge(40);
        t.sayHello();
        t.explain();

    }

}
