package ch07;

class C {
    void autoPlay(I i){
        i.play();
    }
}

interface I {
    public abstract void play();
}

class D implements I {
    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class E implements I {
    @Override
    public void play() {
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
       C c = new C();
       c.autoPlay(new D());
       c.autoPlay(new E());
    }
}
