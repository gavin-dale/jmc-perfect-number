public class Main {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }

        int divisorTotal = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
               divisorTotal += i;
            }
        }

        if(divisorTotal == number){
            return true;
        } else {
            return false;
        }
    }
}
