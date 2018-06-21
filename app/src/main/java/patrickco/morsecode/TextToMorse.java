package patrickco.morsecode;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextToMorse {
    String mMessageText = "";
    List<Integer> mMessage = new ArrayList<>();
    public static final Map<Character, int[]> map = new HashMap<Character, int[]>();

    static {
        map.put('a', new int[]{1, 3});
        map.put('b', new int[]{3,1,1,1});
        map.put('c', new int[]{3,1,3,1});
        map.put('d', new int[]{3,1,1});
        map.put('e', new int[]{1});
        map.put('f', new int[]{1,1,3,1});
        map.put('g', new int[]{3,3,1});
        map.put('h', new int[]{1,1,1,1});
        map.put('i', new int[]{1, 1});
        map.put('j', new int[]{1, 3, 3, 3});
        map.put('k', new int[]{3, 1, 3});
        map.put('l', new int[]{1, 3, 1, 1});
        map.put('m', new int[]{3, 3});
        map.put('n', new int[]{3, 1});
        map.put('o', new int[]{3, 3, 3});
        map.put('p', new int[]{1, 3, 3, 1});
        map.put('q', new int[]{3, 3, 1, 3});
        map.put('r', new int[]{1, 3, 1});
        map.put('s', new int[]{1, 1, 1});
        map.put('t', new int[]{3});
        map.put('u', new int[]{1, 1, 3});
        map.put('v', new int[]{1, 1, 1, 3});
        map.put('w', new int[]{1, 3, 3});
        map.put('x', new int[]{3, 1, 1, 3});
        map.put('y', new int[]{3, 1, 3, 3});
        map.put('z', new int[]{3, 3, 1, 1});

        map.put('1', new int[]{1, 3, 3, 3, 3});
        map.put('2', new int[]{1, 1, 3, 3, 3});
        map.put('3', new int[]{1, 1, 1, 3, 3});
        map.put('4', new int[]{1, 1, 1, 1, 3});
        map.put('5', new int[]{1, 1, 1, 1, 1});
        map.put('6', new int[]{3, 1, 1, 1, 1});
        map.put('7', new int[]{3, 3, 1, 1, 1});
        map.put('8', new int[]{3, 3, 3, 1, 1});
        map.put('9', new int[]{3, 3, 3, 3, 1});
        map.put('0', new int[]{3, 3, 3, 3, 3});

        map.put(' ', new int[]{});
    }

    public static final Map<String, String> map2 = new HashMap<String, String>();

    static {
        map2.put("a", "1, 3");
        map2.put("b", "3,1,1,1");
        map2.put("c", "3,1,3,1");
        map2.put("d", "3,1,1");
        map2.put("e", "1");
        map2.put("f", "1,1,3,1");
        map2.put("g", "3,3,1");
        map2.put("h", "1,1,1,1");
        map2.put("i", "1, 1");
        map2.put("j", "1, 3, 3, 3");
        map2.put("k", "3, 1, 3");
        map2.put("l", "1, 3, 1, 1");
        map2.put("m", "3, 3");
        map2.put("n", "3, 1");
        map2.put("o", "3, 3, 3");
        map2.put("p", "1, 3, 3, 1");
        map2.put("q", "3, 3, 1, 3");
        map2.put("r", "1, 3, 1");
        map2.put("s", "1, 1, 1");
        map2.put("t", "3");
        map2.put("u", "1, 1, 3");
        map2.put("v", "1, 1, 1, 3");
        map2.put("w", "1, 3, 3");
        map2.put("x", "3, 1, 1, 3");
        map2.put("y", "3, 1, 3, 3");
        map2.put("z", "3, 3, 1, 1");

        map2.put("1", "1, 3, 3, 3, 3");
        map2.put("2", "1, 1, 3, 3, 3");
        map2.put("3", "1, 1, 1, 3, 3");
        map2.put("4", "1, 1, 1, 1, 3");
        map2.put("5", "1, 1, 1, 1, 1");
        map2.put("6", "3, 1, 1, 1, 1");
        map2.put("7", "3, 3, 1, 1, 1");
        map2.put("8", "3, 3, 3, 1, 1");
        map2.put("9", "3, 3, 3, 3, 1");
        map2.put("0", "3, 3, 3, 3, 3");

        map2.put(" ", "-7");
    }

    TextToMorse() {
    }

//    public static String returnMapping(String input) {
//        String in = input.toLowerCase();
//        String message = "";
//        //grab each input character in lowercase
//        for (int i = 0; i < in.length(); i++) {
//            char character = in.charAt(i);
//            //convert character to Morse byte[]
//            String tempString = map2.get(Character.toString(character));
//            System.out.println(character + ": " + tempString);
//            message += tempString;
//            //put in spaces if not at the end
//            if (i < in.length()) {
//                message += "7";
//            }
//        }
//        return message;
//    }

    public static List<Integer> returnMapping(String input) {
        String alpha = input.replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " ");
        String in = alpha.toLowerCase();
        System.out.println("input string: " + in);
        List<Integer> message = new ArrayList<>();

        //grab each input character in lowercase
        for (int i = 0; i < in.length(); i++) {
            char character = in.charAt(i);
            //convert character to Morse byte[]
            int[] tempArr = map.get(character);
            System.out.println(character + ": " + Arrays.toString(tempArr));
            for (int toAdd: tempArr
                 ) {
                message.add(toAdd);
            }
            if(character != ' ')
            {
                message.add(-3);
            }
            //put in spaces between letters if not at the end
            else
            {
                message.remove(message.size()-1);
                message.add(-7);
            }
        }
        //strip last space
        message.remove(message.size()-1);
        return message;
    }

}
