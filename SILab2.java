import java.util.*;

public class SILab2 {

    public static List<String> function(List<String> list) {

        if (list.size() <= 0) { //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        int n = list.size(); //C
        int rootOfN = (int) Math.sqrt(n); //C
        if (rootOfN * rootOfN != n) { //D
            throw new IllegalArgumentException("List length should be a perfect square"); //E
        }
        List<String> numMines = new ArrayList<>(); //F
        for (int i = 0; i < n; i++) { //G
            if (!list.get(i).equals("#"))  { //H
                int num = 0;//I
                if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#"))) {
                    //J
                    if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")))  {
                        //K
                        num += 2; //L
                    } else { //M
                        num += 1; //N
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")) { //O
                    num++; //P
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")) { //Q
                    num++; //R
                }
                numMines.add(String.valueOf(num)); //S
            } else { //T
                numMines.add(list.get(i)); //U
            }
        }
        return numMines; //V
    } //W

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        n=n*n;
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }
        List<String> numMines = function(list);
        for (String numMine : numMines) {
            System.out.print(numMine + " ");
        }


//        int rootOfN = (int) Math.sqrt(n);
//        for (int i = 0; i < n; i++) {
//            if (i % rootOfN == 0) {
//                System.out.println();
//            }
//            System.out.print(numMines.get(i) + " ");
//        }

    }
}