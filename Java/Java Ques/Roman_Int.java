
import java.util.HashMap;

class Roman_Int {

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curent = romanMap.get(s.charAt(i));
            if (i + 1 < s.length() && curent < romanMap.get(s.charAt(i + 1))) {
                result -= curent;
            } else {
                result += curent;
            }
        }
        return result;
    }
}
