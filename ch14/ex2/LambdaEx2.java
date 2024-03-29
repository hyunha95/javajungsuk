package ch14.ex2;

@FunctionalInterface
interface MyFunction {
    void myMethod(); // public abstract void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {}; // MyFunction f = (MyFunction) (()->{});
        Object obj = (MyFunction)(()->{}); // Object타입으로 형변환이 생략됨
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(()->{}); // 에러. 람다식은 Object타입으로 형변환 안됨
        System.out.println((MyFunction)(()->{}));

    }
}
