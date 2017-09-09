package lec16.oop.interfaces.defaultandstaticmethod;
public class App1 implements A {
    @Override
    public void doIt() {
        System.out.println("inside App1");
    }

    public static void main(String[] args) {
        new App1().doIt();
    }
}

interface A {
    default void doIt() {
        System.out.println("inside A");
    }
}