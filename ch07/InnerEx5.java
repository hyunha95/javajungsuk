package ch07;

class Outer_ {
    int value = 10; //Outer_.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("            value : " + value);
            System.out.println("        this.value: " + this.value);
            System.out.println("Outer_.this.value : " + Outer_.this.value);
        }
    }
}

public class InnerEx5 {
    public static void main(String[] args) {
        Outer_ outer = new Outer_();
        Outer_.Inner inner = outer.new Inner();
        inner.method1();
    }
}
