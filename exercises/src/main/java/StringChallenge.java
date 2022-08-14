import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringChallenge {



    public static String StringChallenge(String str) {


            Map<Character, Integer> stringMaps = new HashMap<Character, Integer>();

            for (int i = 0; i < str.length(); ++i) {
                char charAt = str.charAt(i);
                if (!stringMaps.containsKey(charAt)) {
                    stringMaps.put(charAt, 0);
                }
                stringMaps.put(charAt, stringMaps.get(charAt) + 1);
            }
            for (Map.Entry<Character, Integer> entry : stringMaps.entrySet()) {

                System.out.println(entry.getValue() +  entry.getKey().toString());
            }

            return "";
        }



    public static void main (String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print(StringChallenge(s.nextLine()));
        }

    }

