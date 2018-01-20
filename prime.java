

 class assignment_3_Q2 {
	
 public static void main(String[] args ){
	 
	
	int a= Integer.parseInt(args[0]);
	System.out.println(a);
	
	 for(int i=2;i<=a;i++){
		 
		 for(int j = 2;j<=i;j++){
			 
			 if(j==i){
				 System.out.println(i);
				 
			 }if(i%j==0){
				 break ;
			 }
		 }
	 }
	 }
	
	
}
