import java.util.*;
public class recharge{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for rechage 0 to check balance");
		int n=sc.nextInt();
		int am=0;
		if(n==1){
		System.out.println("Enter 1 ar 2 vi 3 jio 3 bn");
		int k=sc.nextInt();
			if(k==1){
			am+=399;}
			else if(k==2){
			am+=300;
			}else if(k==3){
			am+=299;
			}else if(k==4){
			am+=100;
			}
System.out.println("the ammount is : "+ am);
		}
		else if(n==0){
		System.out.println(am);
		}
		}
}
				
