class Data { int x; }

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);

    }

    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
