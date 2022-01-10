package codingproblems;

public class ExcelColumnTitle {

	private static void printString(int columnNumber)
    {
        // To store result (Excel column name)
        StringBuilder columnName = new StringBuilder();
 
        while (columnNumber > 0) {
            // Find remainder
            int rem = columnNumber % 26;
            
			
			/*
			 * String s="12"; int d1; StringBuilder d2; for (int i = 0; i <1; i++) {
			 * d1=(s.charAt(i)) -'0'; char ch = 1+'A'; System.out.println(ch); }
			 */
			  
			 
            
 
            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else // If remainder is non-zero
            {
                columnName.append((char)((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
 
        // Reverse the string and print result
        System.out.println(columnName.reverse());
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
        printString(26);
        printString(51);
        printString(52);
        printString(80);
        printString(676);
        printString(702);
        printString(705);
    }

}
