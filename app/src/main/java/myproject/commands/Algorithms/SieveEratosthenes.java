package myproject.commands.Algorithms;

public class SieveEratosthenes {

	public static int[] get_prime(int number){
		int[] list = new int[number-1];
		int null_counter = 0;
		for(int i=0; i<number-1; i++){
			list[i] = i+2;
		}
		for(int i=0; i<list.length; i++){
			for(int n=0; n<list.length; n++){
				if(list[i]==0||list[n]==0)
					continue;
				if(list[n]%list[i]==0&&list[n]!=list[i]){
					list[n]=0;
					null_counter++;
				}
			}
		}
		return copy_array_without_nulls(list, list.length-null_counter);
	}

	private static int[] copy_array_without_nulls(int[] list, int size) {
		int[] result_list = new int[size];
		int counter = 0;
		for (int i=0; i<list.length; i++){
			if(list[i]!=0){
				result_list[counter] = list[i];
				counter++;
			}
		}
		return result_list;
	}
}
