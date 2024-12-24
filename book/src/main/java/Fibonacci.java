import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(3));
    }
    public static String getFibonacci(int num){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        for (int i = 2; i < num; i++){
            numbers.add(i, numbers.get(i-1) + numbers.get(i-2));
        }
        return numbers.toString();
    }
}
