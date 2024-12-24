import java.util.*;

public class Vampires {
    public static void main(String[] args){
        List<Integer> resultList = new ArrayList<>();

        for (int num = 1000; num < 10000; num++){

            String numberAsString = String.valueOf(num);
            String[] array = numberAsString.split("");

            if (
            (Integer.parseInt(array[0] + array[1]) * Integer.parseInt(array[2] + array[3]))
             == num
            || (Integer.parseInt(array[1] + array[0]) * Integer.parseInt(array[2] + array[3]))
             == num
            || (Integer.parseInt(array[0] + array[2]) * Integer.parseInt(array[1] + array[3]))
             == num
            || (Integer.parseInt(array[2] + array[0]) * Integer.parseInt(array[1] + array[3]))
             == num
            || (Integer.parseInt(array[0] + array[3]) * Integer.parseInt(array[1] + array[2]))
            == num
            || (Integer.parseInt(array[3] + array[0]) * Integer.parseInt(array[1] + array[2]))
            == num
                    || (Integer.parseInt(array[0] + array[1]) * Integer.parseInt(array[3] + array[2]))
                    == num
                    || (Integer.parseInt(array[1] + array[0]) * Integer.parseInt(array[3] + array[2]))
                    == num
                    || (Integer.parseInt(array[0] + array[2]) * Integer.parseInt(array[3] + array[1]))
                    == num
                    || (Integer.parseInt(array[2] + array[0]) * Integer.parseInt(array[3] + array[1]))
                    == num
                    || (Integer.parseInt(array[0] + array[3]) * Integer.parseInt(array[2] + array[1]))
                    == num
                    || (Integer.parseInt(array[3] + array[0]) * Integer.parseInt(array[2] + array[1]))
                    == num

            ){
                resultList.add(num);
            }

        }
        System.out.println(resultList);
    }
}
