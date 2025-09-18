public class NestedBowl {
    public static void main(String[] args) {
        int[][] bowl = {
            {2, 5}, {4, 3}, {3, 7}, {5, 8}, {7, 9}, {5, 8},
            {9,6}, {11, 11}
        };

        int n = bowl.length;

        // Sort by first dimension, then second dimension
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bowl[j][0] > bowl[j + 1][0]){
                    int temp = bowl[j][0];
                     bowl[j][0] = bowl[j + 1][0];
                    bowl[j + 1][0] = temp;

                    temp = bowl[j][1];
                    bowl[j][1] = bowl[j + 1][1];
                    bowl[j + 1][1] = temp;
                
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (bowl[i][1] < bowl[i + 1][1]) {
                count++;
            }
        }

        System.out.println("The maximum number of bowls that can be placed inside another bowl is " + count);
    }
}
