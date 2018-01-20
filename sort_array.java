package acadview;

public class assignment_3_Q6 {
	public static void main(String args[]){
		
		int arr[] =  {0,0,1,1,1,1,0};
		
		
		int count_zero=0;
		for (int i =0;i<arr.length;i++){
			if( arr[i]==0){
				count_zero=count_zero+1;
			}
		}System.out.println(arr);
	}

}
