
public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia

        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        c.a();
        c.b();
        c.c();

    }
}
