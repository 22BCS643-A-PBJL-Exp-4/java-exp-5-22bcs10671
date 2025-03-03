import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {
    
    public static void main(String[] args) {
        
        List<String> numberStrings = List.of("10", "20", "30", "40", "50");
        
        
        List<Integer> numbers = parseStringsToIntegers(numberStrings);
        
       
        int sum = calculateSum(numbers);
        
        System.out.println("Sum of the numbers: " + sum);
    }
    
   
    public static List<Integer> parseStringsToIntegers(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for (String str : stringList) {
            intList.add(Integer.parseInt(str)); 
        return intList;
    }
    
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }
        return sum;
    }
}
