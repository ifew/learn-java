
public class WorkingWithLoop {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            System.out.println("Hello while " + i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("Hello for " + j);
        }

        int k = 0;
        do {
            System.out.println("Hello do while " + k);
            k++;
        } while (k < 5);

        System.out.println("Loop Sum 1 to 10 = " + LoopSum1to10());
        LoopHeart();
    }

    static int LoopSum1to10() {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }

        return result;
    }

    static void LoopHeart() {
        // line 1
        System.out.println(" **   ** ");
        System.out.println("**** ****");
        
        // line 3-7
        int start = 9;
        for (int round = 0; round < 5; round++) {
            for (int a = 0; a < round; a++) {
                System.out.print(" ");
            }
            for (int b = 0; b < start; b++) {
                System.out.print("*");
            }
            System.out.println();
            start = start -2;
        }
    }
}
