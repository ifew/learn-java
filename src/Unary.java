
public class Unary {

    public static void main(String[] args) {
        int a, b, c = 0;
        a = c++; //a1 b0 c1
        b = ++a; //a2 b2 c1
        System.out.printf("a%d b%d c%d", a, b, c);
        System.out.println("---");
        
        c++; //a2 b2 c2
        System.out.printf("a%d b%d c%d", a, b, c);
        System.out.println("---");
        
        b = ++c + a++; //a3 b6 c3
        System.out.printf("a%d b%d c%d", a, b, c);
        System.out.println("---");
        
        a = --b + c++; //a9 b5 c4
        System.out.printf("a%d b%d c%d", a, b, c);
    }

}
