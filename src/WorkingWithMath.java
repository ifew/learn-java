
public class WorkingWithMath {

    public static void main(String[] args) {
        int exponent = 2;
        int x1 = 2;
        int x2 = 0;
        int y1 = 1;
        int y2 = 0;
        int z1 = 3;
        int z2 = 6;
        
        double pow_x = Math.pow(x1 - x2, exponent);
        double pow_y = Math.pow(y1 - y2, exponent);
        double pow_z = Math.pow(z1 - z2, exponent);
        
        double d = Math.sqrt(pow_x + pow_y + pow_z);
        
        System.out.println(d);
        
    }

}
