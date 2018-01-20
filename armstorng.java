
 class assignment_3_Q4 {
	
public static void main(String args[]){
	
int a= 153;
int temp = a;
int r;
int sum=0;

while(a>0){

r = a%10;
a =a/10;
sum = sum + r*r*r;
}
if(temp==temp){
	System.out.println("armstrong");
	
}else {System.out.print("not armstrong");}
}}
