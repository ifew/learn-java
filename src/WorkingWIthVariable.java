public class WorkingWIthVariable {

    public static void main(String[] args) {
        WorkingWIthVariable hello = new WorkingWIthVariable();
        hello.say(100);
    }
    // Constant
    private static final int NUMBER_TWO = 2;
    // Class variable
    public static int index = 1;
    // Instant variable
    private int number = 3;
    
    private void say(int number) {
        int index = 0; //0 Local variable
        System.out.println(index); //0
        System.out.println(this.index); //1 NOT RECOMMEND TO USE
        System.out.println(WorkingWIthVariable.index); //1
        System.out.println(number); //100
        System.out.println(this.number); //3
        System.out.println(NUMBER_TWO); //2
    }

}
