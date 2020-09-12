public class Matrix
{
   public static String dimensionOf(double[][] a)
   {
      if(isRectangle(a))
         return a.length+"x"+a[0].length+" matrix";
      else if(!isFull(a))
         return "matrix is empty";
      else
         return "not a rectangle matrix";
   }
   public static boolean isFull(double[][] a)
   {
      int n1=0, n2=0;
      for(double[] row : a)
      {
         n1++;
         n2=0;
         for(double element : row)
         {
            n2++;
            break;
         }
         if(n2==0)
            return false;
      }
      if(n1==0)
         return false;
         
      return true;
   }
   public static boolean isRectangle(double[][] a)
   {
      if(isFull(a))
      {
         int column=a[0].length;
         int n=0;
         for(double[] row : a)
         {
            for(double element : row)
            {
               n++;
            }
            if(n!=column)
               return false;
         }
         return true;
      }
      else
         return false;
   }
   public static boolean isSquare(double[][] a)
   {
      if(isRectangle(a))
         return a.length==a[0].length;
      else
         return false;
   }
   public static double[][] RREFormOf(double[][] a)
   {
      if(!isRectangle(a))
      {
         
         return a;
         
      }
      else
         return a;
   }
   public static double[][] transpositionOf(double[][] a)
   {
      return a;
   }
   public static boolean isSymmetric(double[][] a)
   {
      //for n by n matirx, 1+2+..+(n-1)=n(n-1)/2=O(n^2)
      if(!isSquare(a))
         return false;
      else
      {
         for(int i=0; i<a.length;i++)
         {
            for(int j=i+1;j<a[i].length;j++)
            {
               if(a[i][j]!=a[j][i])
                  return false;
            }
         }
         return true;
      }
   }
   public static boolean isInvertible(double[][] a)
   {
      if(!isSquare(a)||determinantOf(a)==0)
         return false;
      else
         return true;
   }
   public static double[][] inverseOf(double[][] a)
   {
      return a;
   }
   public static double determinantOf(double[][] a)
   {
      return 0;
   }
   public static void main(String [] args)
   {
      //matrix elements: row column;
      //dimension = row x column;
      //find rref
      //symmetric;
      //transposition: (A)T
      //inverse or invertibility
      //null space,row space, column space
      //determinant: Operations -- pattern method
      //linear transformation
      
      
   }
}