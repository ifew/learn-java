package FizzBuzz;

public class FizzBuzz {

    public String Say(int number) {
        if(Mod3And5(number)) {
            return "FizzBuzz";
        }
        if(Mod3(number)) {
            return "Fizz";
        }
        if(Mod5(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean Mod5(int number) {
        return number % 5 == 0;
    }

    private boolean Mod3(int number) {
        return number % 3 == 0;
    }

    private boolean Mod3And5(int number) {
        return Mod3(number) && Mod5(number);
    }

}
