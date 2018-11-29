/* 11/29/2018
This program is to practice utilizing multi dimensional arrays in JAVA.
*/

package tameana;

class apples{
    public static void main(String[] args){
        //create an array for a row and column of data
    	int firstArray[][]= { {8,23,59,12,0},{7,52,11,9,500} };
    	int secondArray[][] = { {20,21,22,25,12},{3,23,9,95} };
    	
    	System.out.println("This is the first array");
    	displayArray(firstArray);
    	
    	System.out.println("This is the second array");
    	displayArray(secondArray);
    }
    //display array data in a table
    public static void displayArray (int x[][]) {
    //loop for row
    	for(int row=0;row<x.length;row++) {
    		//column=0 to start at first index(java starts at 0)
    		//.length to include all numbers in array
    		//increment by one as column goes
    		for(int column=0;column<x[row].length;column++) {
    			//output don't use println because will mess with display
    			System.out.print(x[row][column]+"\t");
    		}
    		//without this line all row would be on one row
    		System.out.println();
    	}
    	
    	
    }
}
