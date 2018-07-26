public class WorkingWithString {

    public static void main(String[] args) {
        String name = "iFew";
        int age = 22;
        
        String result = name + " " + age; // Generation 1
        System.out.println(result);
        
        StringBuffer buffer = new StringBuffer(); // Generation 2 (เลิกใช้)
        buffer.append(name).append(" ").append(age); 
        System.out.println(buffer.toString());
        
        StringBuilder builder = new StringBuilder(); // Generation 3 (ปรับปรุง performance จาก StringBuffer, thread safe)
        builder.append(name).append(" ").append(age);
        System.out.println(builder.toString());

        String result2 = String.format("%s %d", name, age); // Generation 4
        System.out.println(result2);
        
        System.out.printf("%s %d", name, age, args); // Generation 4
        
    }

}
