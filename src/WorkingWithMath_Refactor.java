
public class WorkingWithMath_Refactor {

    public static void main(String[] args) {
        Space3D space3d = new Space3D();
        Point3D startPoint = new Point3D(2, 1, 3);
        Point3D endPoint = new Point3D(0, 0, 6);
        double distance = space3d.CalculateDistanct(startPoint, endPoint);
        
        System.out.println(distance);
        
    }

}

class Point3D {
    
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    int x;
    int y;
    int z;
}

class Space3D {
    public double CalculateDistanct(Point3D startPoint, Point3D endPoint) {
        int exponent = 2;
        
        double pow_x = Math.pow(startPoint.x - endPoint.x, exponent);
        double pow_y = Math.pow(startPoint.y - endPoint.y, exponent);
        double pow_z = Math.pow(startPoint.z - endPoint.z, exponent);
        
        double distance = Math.sqrt(pow_x + pow_y + pow_z);
        
        return distance;
        
    }
}