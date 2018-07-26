
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "Chitpong2018";
        int namelength = name.length();
        
        System.out.println(namelength);
        
        for(int i=0; i < namelength; i++) {
            System.out.println("CHAR = " + name.substring(0, 1));
            name = name.substring(1);
            
            System.out.println("REMAIN = " + name);
        }
        
        System.out.println("------------------");
        
        String name2 = "Wuttanan";
        
        System.out.println(name2.length());
        
        while(name2.length() > 0) {
            System.out.println("CHAR = " + name2.substring(0, 1));
            name2 = name2.substring(1);
            
            System.out.println("REMAIN = " + name2);
        }
    }

}
