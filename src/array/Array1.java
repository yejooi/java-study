package array;

public class Array1 {
    static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
