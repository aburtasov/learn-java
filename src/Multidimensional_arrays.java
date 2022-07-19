public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3}; // для обращения к элементу массиву нужен лишь один индекс
        System.out.println(numbers[1]);

        System.out.println("===========");

        /*
         * 1,2,3,4,5
         * 
         * 156
         * 376 [1][1] == 7
         * 268
         */

         int[][]matrix = {{1,2,3},
         {4,5,6},
         {7,8,9}};

         System.out.println(matrix[2][0]); // 7
         System.out.println(matrix[1][0]); // 4

         //int[][]matrix2 = {{1,2,3,4},{3},{4,14}};

         System.out.println("===========");

         String[][]strings = new String[2][3];
         strings[0][1] =  "Hello";

        System.out.println(strings[0][1]);

        System.out.println("===========");

        int[][]matrix2 = {{1,2,3,4},{3},{4,14}};
        // вывод всех элементов двумерного массива
        for(int i = 0; i <matrix2.length; i ++) {
            for(int j = 0; j < matrix2[i].length; j++) {
                System.out.println(matrix2[i][j]);
            }
            System.out.println("************");
        }

    }
}
