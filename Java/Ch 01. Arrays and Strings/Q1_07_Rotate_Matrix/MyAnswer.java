package Q1_07_Rotate_Matrix;

import CtCILibrary.AssortedMethods;

public class MyAnswer {

  public static void main(String[] args) {
    int[][] image = AssortedMethods.randomMatrix(4, 4, 0, 9);
    AssortedMethods.printMatrix(image);
    int[][] result = rotate(image);


    System.out.println("---------------------");
    AssortedMethods.printMatrix(result);

  }

  private static int[][] rotate(int[][] image) {
    int[][] result = new int[image.length][image.length];

    for (int i = 0; i < image.length; i++) {
      int length = image.length;
      for (int j = 0; j < image.length; j++) {
        result[i][j] = image[--length][i];
      }
    }
    return result;
  }

}
