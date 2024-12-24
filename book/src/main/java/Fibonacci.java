import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(5));
    }
    public static String getFibonacci(int num){
        List<Integer> numbers = new ArrayList<>(List.of(1,1));
        for (int i = 2; i < num; i++){
            numbers.add(i, numbers.get(i-1) + numbers.get(i-2));
        }
        return numbers.toString();
    }
}
