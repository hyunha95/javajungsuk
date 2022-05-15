package ch07;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A_ a = new A_();
        a.methodA();
    }
}

class A_ {
    void methodA() {
        I_ i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I_ {
    public abstract void methodB();
}

class B_ implements I_ {
    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }
    public String toString() { return "class B"; }
}

class InstanceManager {
    public static I_ getInstance() {
        return new B_();
    }
}
