package lambton;

import java.util.HashMap;
import java.util.Map;

public class Week09 {
    public static void main(String[] args) {
        String str = "hello hello how Are you HELLO are there happy test you";
        str = str.toLowerCase();
        countWords(str);
    }

    public static void countWords(String input) {
        Map <String, String> map = new HashMap <String, String> ();

        if (input != null) {
            String[] separatedWords = input.split(" ");
            for (String str: separatedWords) {
                if (map.containsKey(str)) {
                    int count = Integer.parseInt(map.get(str));
                    map.put(str, String.valueOf(count + 1));
                } else {
                    map.put(str, "1");
                }
            }
        }

        System.out.println("Count :- " + map);
    }
}
