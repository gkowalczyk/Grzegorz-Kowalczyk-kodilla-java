import java.util.Scanner;

public class EightsQueen {

    //Have the function EightQueens(strArr) read strArr which will be an array consisting of the locations of eight Queens
    // on a standard 8x8 chess board with no other pieces on the board. The structure of strArr will be
    // the following: ["(x,y)", "(x,y)", ...] where (x,y) represents the position of the current queen on the
    // chessboard (x and y will both range from 1 to 8 where 1,1 is the bottom-left of the chessboard and 8,8 is
    // the top-right). Your program should determine if all of the queens are placed in such a way where none of
    // them are attacking each other. If this is true for the given input, return the string true otherwise return
    // the first queen in the list that is attacking another piece in the same format it was provided.
    //
    //For example: if strArr is ["(2,1)", "(4,2)", "(6,3)", "(8,4)", "(3,5)", "(1,6)", "(7,7)", "(5,8)"] then your
    // program should return the string true. The corresponding chessboard of queens for this input is below (taken from Wikipedia).
///
    //Examples
    //Input: new String[] {"(2,1)", "(4,3)", "(6,3)", "(8,4)", "(3,4)", "(1,6)", "(7,7)", "(5,8)"}
    //Output: (2,1)
    //Input: new String[] {"(2,1)", "(5,3)", "(6,3)", "(8,4)", "(3,4)", "(1,8)", "(7,7)", "(5,8)"}
    //Output: (5,3)

    //new String[] {"(1,1)", "(7,2)", "(4,3)", "(6,4)", "(8,5)", "(2,6)", "(5,7)", "(5,8)"}
//8, 5
    public static String EightQueens(String[] strArr) {

        int xPosI = 0;
        int yPosI = 0;
        int xPosJ = 0;
        int yPosJ = 0;

        for (int i = 0; i < strArr.length; i++) {
            xPosI = Integer.parseInt(strArr[i].substring(1, 2));
            yPosI = Integer.parseInt(strArr[i].substring(3, 4));

            for (int j = 0; j < strArr.length; j++) {
                xPosJ = Integer.parseInt(strArr[j].substring(1, 2));
               // System.out.println(xPosJ);
                yPosJ = Integer.parseInt(strArr[j].substring(3, 4));

                if (strArr[i] != strArr[j]) {
                    if (    xPosI == yPosJ && yPosI == xPosJ ||   //new String[] {"(1,1)", "(7,2)", "(4,3)", "(6,4)", "(8,5)", "(2,6)", "(5,7)", "(5,8)"} np   dla  (8,5)    (5,8)"
                            xPosI == xPosJ   // poziom
                            || yPosI == yPosJ || // pion
                            xPosI - xPosJ == yPosI - yPosJ  // ukos
                            ) {
                        return strArr[i];
                    }
                }
            }
        }
        return "true";
    }
// Integer.parseInt(otherQueen.substring(1,2))-y==
// x-Integer.parseInt(otherQueen.substring(3,4))) {
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(EightQueens(new String[]{"(2,1)", "(4,3)", "(6,3)", "(8,4)", "(3,4)", "(1,6)", "(7,7)", "(5,8)"}));
    }
}


