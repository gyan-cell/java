public class twodArray {
  public static void main(String[] args) {
    int row = 4;
    int coloumn = 4;
    int[][] array = new int[row][coloumn];
    int value = 1;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < coloumn; j++) {
        array[i][j] = value;
        value ++;
      }
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < coloumn; j++) {
        System.out.println(array[i][j]+"");
      }
    }
    System.out.println();;
  }
}
