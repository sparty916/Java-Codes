/* P.j. Ellis - Module 11
 * 12/13/2022
 * Write methods using the following headers that returns the location of the 
 * largest element in the array passed to the method returning a one-dimensional 
 * array that contains two location elements.
 * public static int [] locateLargest (double [][] arrayParam)
 * public static int [] locateLargest (int [][] arrayParam)
 * Then, write methods using the following headers that returns the location of 
 * the smallest element in the array passed to the method returning a 
 * one-dimensional array that contains two location elements.
 * public static int [] locateSmallest (double [][] arrayParam)
 * public static int [] locateSmallest (int [][] arrayParam)
 */



public class LrgSmlTwoDimensionArray {
    
    // Methods
    public static int[] locateLargest(double[][] a) {
        double max = a[0][0];
        int i1 =0,j1=0;
        for (int i= 0;i <a.length;i++) {
            for (int j =0; j<a[i].length;j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    i1 =i;
                    j1 =j;
                } //End of IF
            }//End of Nested For
        }//End of For
        int[] lrgDouble = {i1,j1};
        return lrgDouble;
    }//End of Largest Double Method
    
    public static int[] locateLargest(int[][] a) {
        int max = a[0][0];
        int i1 =0,j1=0;
        for (int i= 0;i <a.length;i++) {
            for (int j =0; j<a[i].length;j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    i1 =i;
                    j1 =j;
                } //End of IF
            }//End of Nested For
        }//End of For
        int[] lrgInt = {i1,j1};
        return lrgInt;
    }//End of Largest Int Method
    
    public static int [] locateSmallest (double [][] a) {
        double min = a[0][0];
        int i2 =0,j2=0;
        for (int i = 0; i < a.length; i++) {
            for (int j =0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    i2 =i;
                    j2 =j;
                } //End of IF
            }//End of Nested For
        }//End of For
        int[] smlDouble = {i2,j2};
        return smlDouble;
    }//End of Smallest Double Method
    
    public static int [] locateSmallest (int [][] a) {
        int min = a[0][0];
        int i1 =0,j1=0;
        for (int i= 0;i <a.length;i++) {
            for (int j =0; j<a[i].length;j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    i1 =i;
                    j1 =j;
                } //End of IF
            }//End of Nested For
        }//End of For
        int[] smlInt = {i1,j1};
        return smlInt;
    }//End of Smallest Int Method

  public static void main (String[] args) {
      //Assign Random Size to my Arrays
      double[][] myArray1 = new double[(int)(Math.random() * (10-2) + 2)]
              [(int)(Math.random() * (10-2) + 2)];
      int [][] myArray2 = new int[(int)(Math.random() * (10-2) + 2)]
              [(int)(Math.random() * (10-2) + 2)];
      //Fill Arrays with Random Numbers
      for (int row =0; row < myArray1.length; row++) {
          for (int column = 0; column < myArray1[row].length; column++) {
              myArray1[row][column] = (int)(Math.random() * 100);
          }//End of nested For
      }//End of For
      
      for (int row2 =0; row2 < myArray2.length; row2++) {
          for (int column2 = 0; column2 < myArray2[row2].length; column2++) {
              myArray2[row2][column2] = (int)(Math.random() * 100);
          }//End of nested For
      }//End of For
      
      //print out arrays
      System.out.println("\nDouble Array");
      for(int x = 0; x < myArray1.length; x++) {
          for(int c = 0; c < myArray1[x].length; c++) {
              System.out.print(myArray1[x][c] + " ");
          }
          
          System.out.println();
      }
      System.out.println("\nInt Array");
      for(int x2 =0; x2 < myArray2.length; x2++) {
          for(int c2 = 0; c2 < myArray2[x2].length; c2++) {
              System.out.print(myArray2[x2][c2] + " ");
          }
          
          System.out.println();
      }
      System.out.println();
      
      int[] dblAnswer = locateLargest(myArray1);
      System.out.println("The location of the largest element in Double Array "
              + "is at (" + dblAnswer[0] +", " + dblAnswer[1] +")");
      
      int[] intAnswer = locateLargest(myArray2);
      System.out.println("The location of the largest element in Int Array "
              + "is at (" + intAnswer[0] +", " + intAnswer[1] +")");
      
      int[] dblSmlAnswer = locateSmallest(myArray1);
      System.out.println("The location of the smallest element in Double Array "
              + "is at (" + dblSmlAnswer[0] +", " + dblSmlAnswer[1] +")");
      
      int[] intSmlAnswer = locateSmallest(myArray2);
      System.out.println("The location of the smallest element in Int Array "
              + "is at (" + intSmlAnswer[0] +", " + intSmlAnswer[1] +")");

      
  } // end of Main 
} // End of class
