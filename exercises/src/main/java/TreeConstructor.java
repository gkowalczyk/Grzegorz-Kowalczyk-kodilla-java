import java.util.*;

public class TreeConstructor {
    //Have the function TreeConstructor(strArr) take the
    // array of strings stored in strArr, which will contain
    // pairs of integers in the following format: (i1,i2),
    // where i1 represents a child node in a tree and the second
    // integer i2 signifies that it is the parent of i1. For example:
    // if strArr is ["(1,2)", "(2,4)", "(7,2)"],
    // then this forms the following tree:
    //
    //
    //

    //which you can see forms a proper binary tree. Your program should,
    // in this case, return the string true because a valid binary tree
    // can be formed. If a proper binary tree cannot be formed with the
    // integer pairs, then return the string false. All of the integers
    // within the tree will be unique, which means there can only be one
    // node in the tree with the given integer value.
    //Examples
    //Input: new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}
    //Output: true
    //Input: new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}
    //Output: false


    //[^-]* – Jakikolwiek znak tylko nie minus powtórzony dowolną ilość razy,

    public static String TreeConstructor(String[] strArr) {

        final Set<String> child = new HashSet<>();
        final Map<String, Integer> parent = new HashMap<>();
// System.out.println(Arrays.toString(strArr));
        for (String node : strArr) {

            String[] array = node.replaceAll("[^0-9,]", "").split(",");
            child.add(array[0]);
            Integer parentCounter = parent.get(array[1]);  // return value for string key "string object"

            if (parentCounter != null && ++parentCounter > 2) {  // ++count   -> increment +1
                return "false";
            } else {
                parent.put(array[1], parentCounter == null ? 1 : ++parentCounter); // ++count   -> increment +1
            }
        }
        return "" + (child.size() == strArr.length);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TreeConstructor(new String[] {"(1,2)", "(3,4)"}));
    }
}
