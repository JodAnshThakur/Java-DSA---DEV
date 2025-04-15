//                               Looping
public class Day5 {
    public static void main(String args[]) {

        // for loop -> Printing from 10 - 1
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }

        // while Loop -> Printing factorial of 5
        int l = 5;
        int sum = 1;
        while (l > 0) {
            sum = sum * l;
            l--;
        }
        System.out.println(sum);

        // do-while -> Printing multiples of 3
        int k = 1;
        do {
            System.out.println(3 * k);
            k++;
        } while (k <= 10);

        // labelled loop -> outer
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
