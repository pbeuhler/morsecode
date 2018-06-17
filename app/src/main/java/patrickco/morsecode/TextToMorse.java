package patrickco.morsecode;

import java.util.HashMap;
import java.util.Map;

public class TextToMorse {
    String mMessageText = "";
    public static final Map<String, int[]> map = new HashMap<String, int[]>();

    static {
        map.put("a", new int[]{1, 3});
        map.put("i", new int[]{1, 1});
        map.put("j", new int[]{1, 3, 3, 3});
        map.put("k", new int[]{3, 1, 3});
        map.put("l", new int[]{1, 3, 1, 1});
        map.put("m", new int[]{3, 3});
        map.put("n", new int[]{3, 1});
        map.put("o", new int[]{3, 3, 3});
        map.put("p", new int[]{1, 3, 3, 1});
        map.put("q", new int[]{3, 3, 1, 3});
        map.put("r", new int[]{1, 3, 1});
        map.put("s", new int[]{1, 1, 1});
        map.put("t", new int[]{3});
        map.put("u", new int[]{1, 1, 3});
        map.put("v", new int[]{1, 1, 1, 3});
        map.put("w", new int[]{1, 3, 3});
        map.put("x", new int[]{3, 1, 1, 3});
        map.put("y", new int[]{3, 1, 3, 3});
        map.put("z", new int[]{3, 3, 1, 1});

        map.put("1", new int[]{1, 3, 3, 3, 3});
        map.put("2", new int[]{1, 1, 3, 3, 3});
        map.put("3", new int[]{1, 1, 1, 3, 3});
        map.put("4", new int[]{1, 1, 1, 1, 3});
        map.put("5", new int[]{1, 1, 1, 1, 1});
        map.put("6", new int[]{3, 1, 1, 1, 1});
        map.put("7", new int[]{3, 3, 1, 1, 1});
        map.put("8", new int[]{3, 3, 3, 1, 1});
        map.put("9", new int[]{3, 3, 3, 3, 1});
        map.put("0", new int[]{3, 3, 3, 3, 3});

        map.put("space", new int[]{3});
        map.put("word", new int[]{7});
    }

    TextToMorse(String input) {
        mMessageText = input;
        System.out.println(map.get("a"));
    }
}
