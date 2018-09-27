public class ArrayDemo{
    public static void main(String[] args){	
		int[] array = new int[5];
		printArray(array);
		int[][] array2 = new int[3][3];
		printArray(array2);
	}
	public static void printArray(int[]ary){
		for (int i = 0; i < ary.length; i += 1){
			System.out.print(ary[i] + ",");
		}	
		System.out.println("");
	}
	public static void printArray(int[][]ary){
		for (int x = 0; x < ary.length; x += 1){
			printArray(ary[x]);
		}	
	}	
}	