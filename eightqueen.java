package graph;

public class eightqueen {
	static int counter;
    static int numQueens[];
    static int numQueen;

    public static void main(String[] args) {
    	
    	numQueens= new int [8];// hold columns postion
        numQueen = 8;
      
        arrange(0);
          
        System.out.println(counter);

    }

    
    static boolean isValid(int rowIndex, int colIndex) {  //valid checking for positions

        for (int i = 0; i < rowIndex; i++) {
            if (numQueens[i] == colIndex) return false;                     // any chess on the same line 
            if ((i - rowIndex) == (numQueens[i] - colIndex)) return false;  // diagonal up
            if ((i - rowIndex) == (colIndex - numQueens[i])) return false;  // diagonal down
        }
        return true;
    }
    
 
    // recursive Function
    static void arrange(int rowIndex) {        
    	// row index = 8;
        // 1.to check valid Postion of not.
        // 2. to check all Queens postion is found or not.
    	
        for (int i = 0; i < numQueen; i++){   
            if (isValid(rowIndex, i)) {
                numQueens[rowIndex] = i;
                
                if (rowIndex == numQueen-1) {
                	counter++;
                	printsBoard();
                }
                else arrange(rowIndex + 1);
                }
        }
    }


    static void printsBoard() {
        for (int i = 0; i < numQueen; i++)
        {
            for (int j = 0; j < numQueen; j++)
            {
                if (numQueens[i] == j)
                {
                    System.out.print(" * ");
                } else System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.println();

    }
    
    
}
    
   





