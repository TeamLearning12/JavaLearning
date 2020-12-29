package java.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class JavaStreams {

    static List<String> myNameList = Arrays.asList("Subash", "Sam", "Jose", "UT", "Sandesh","HImal");
    static  List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

    public static Boolean checkMyNameInList(String name){
        return  myNameList.stream().anyMatch(myName->myName.equals(name));
    }

    public static List<String> filterNameWithStartWith(char c){
        return myNameList.stream().filter(myName->myName.charAt(0)== c).collect(Collectors.toList());
    }


    public static List<String> sortNamesDescending(List<String> names){
        Collections.sort(names,(o1, o2) -> {
            return  o2.compareTo(o1);
        });
        return names;
    }


    public static void main(String[] args) {
        System.out.println("These are the Lists of names I created----" +myNameList);
        System.out.println("Check iF my Name is in the list---> "+ checkMyNameInList("Subash") );
        System.out.println("Filter names that starts with prefix--->"+ filterNameWithStartWith('S'));
        System.out.println("Sorted list---> "+ sortNamesDescending(myNameList));
        System.out.println("Ascending order sorting--->" + myNameList.stream().sorted().collect(Collectors.toList()));
        Random random = new Random();
        random.ints().limit(10).forEach(value -> System.out.println("Random 10 integer values---> " +value));
        System.out.println("Prints distinct Number of integer---->"+  numbers.stream().distinct().collect(Collectors.toList()));
        myNameList.forEach((x)->{
            x.equals("subash"); });
    }
}
