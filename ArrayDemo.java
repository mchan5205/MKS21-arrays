public class ArrayDemo{
    public static void main(String[] args){	
		int[] array = new int[5];
		printArray(array);
	}
	public static void printArray(int[]ary){
		for (int i = 0; i < ary.length; i += 1){
			System.out.print(ary[i] + ",");
		}
	}
}	