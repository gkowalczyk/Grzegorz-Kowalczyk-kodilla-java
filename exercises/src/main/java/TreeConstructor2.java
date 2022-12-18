import java.util.*;
import java.util.stream.Collectors;

public class TreeConstructor2 {


    //Have the function TreeConstructorTwo(strArr) take the array of strings stored in strArr, which
    // will contain pairs of integers in the following format: (i1,i2), where i1 represents a child node
    // in a tree and the second integer i2 signifies that it is the parent of i1.
    // For example: if strArr is ["(1,2)", "(2,4)", "(7,2)"], then this forms the following tree:
    //which you can see forms a proper binary tree. Your program should, in this case, return the string
    // true because a valid binary tree can be formed. If a proper binary tree cannot be formed with the integer pairs, then return the string false. All of the integers within the tree will
    // be unique, which means there can only be one node in the tree with the given integer value.
    //Input: new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}
    //Output: true
    //Input: new String[] {"(1,2)", "(1,3)"}
    //Output: false

    //4
    //2                          //2
    //1       7               //1

    //2
    //1      3
    //3
    ///1. For input new String[] {"(1,2)", "(3,2)", "(4,5)", "(6,5)", "(5,7)", "(2,7)"} the output was incorrect. The correct output is true
    public static String TreeConstructorTwo(String[] strArr) {

        Set<String> nodeList = new HashSet<>();
        Map<String, Integer> parentList = new HashMap<>();
        Integer counter = 0;
        if (strArr.length == 0) {
            return "true";
        }
        for (String node : strArr) {
            String[] array = node.replaceAll("[^0-9,]", "").split(",");
            nodeList.add(array[0]);
            counter = parentList.get(array[1]);
            parentList.put(array[1], counter == null ? counter = 1 : ++counter);
            if (strArr.length == 1) {
                return Objects.equals(array[0], array[1]) ? "false" : "true";
            }
        }
        List<String> list = nodeList.stream()
                .filter(parentList::containsKey)
                .collect(Collectors.toList());
        List<String> integerList = new ArrayList<>();
        for (String node : strArr) {
            String[] array = node.replaceAll("[^0-9,]", "").split(",");

            integerList.add(array[1]);
        }
        if (list.isEmpty() || list.size() < 2 && !integerList.get(0).equals(list.get(0))) {
            return "false";
        }
        if (!integerList.stream().anyMatch(val -> list.contains(val))) {
            return "false";
        }
        if (list.size() > 2 && !parentList.keySet().stream().allMatch(val -> list.contains(val))) {
            return "false";
        }
        return counter > 2 || nodeList.size() != strArr.length ? "false" : "true";
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(TreeConstructorTwo(new String[]{"(1,2)", "(2,3)", "(3,1)", "(5,4)"}));
        //System.out.print(TreeConstructorTwo(new String[]{"(10,20)", "(20,50)"} ));
        System.out.print(TreeConstructorTwo(new String[]{"(1,2)", "(3,2)", "(4,5)", "(6,5)", "(5,7)", "(2,7)"}));


        //7
        //2         5
        //1      3   4        6
        //

    }
}

