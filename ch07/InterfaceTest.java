package ch07;
class A {
    public void methodA(B b){
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}
public class InterfaceTest {
}
