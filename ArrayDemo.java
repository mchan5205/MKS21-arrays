public class ArrayDemo{
    public static void main(String[] args){	
		int[] array = new int[5];
		printArray(array);
		int[][] array2 = new int[][]{
			{1, 2, 3, -4},
			{5, 6, 7, 8},
		};	
		printArray(array2);
		System.out.print(countZeros2D(array2));
		System.out.println();
		printArray(fill2DCopy(array2));
		fill2D(array2);
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
	public static int countZeros2D(int[][] nums){
		int count = 0;
		for (int x = 0; x < nums.length; x += 1){
			for (int i = 0; i < nums[x].length; i += 1){
				if (nums[x][i] == 0){
					count += 1;
				}		
			}	
		}
		return count;
	}
	public static void fill2D(int[][] vals){
		for (int x = 0; x < vals.length; x += 1){
			for (int i = 0; i < vals[x].length; i += 1){
				if (x == i){
					vals[x][i] = 3;
				}
				else{
					vals[x][i] = 1;
				}	
			}	
		}
	}	
	public static int[][] fill2DCopy(int[][] vals){
		int[][] newarray = new int[vals.length][vals[0].length];
		for (int x = 0; x < vals.length; x += 1){
			for (int i = 0; i < vals[x].length; i += 1){
				if (vals[x][i] < 0){
					newarray[x][i] = 3;
				}
				else{
					newarray[x][i] = 1;
				}			
			}	
		}
		return newarray;
	}	
}	