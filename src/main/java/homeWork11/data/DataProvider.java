package homeWork11.data;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProvider {
   static List<Integer> intList = Arrays.asList(1924,1894,1963);
   static List<String> stringList = Arrays.asList("BMW","Ford","Tesla");

    public static int getRandomInt(){
        return intList.get(new Random().nextInt(intList.size()));
    }
    public static String getRandomString(){
        return stringList.get(new Random().nextInt(stringList.size()));
    }
}
