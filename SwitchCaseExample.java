package switchCase;
import java.util.*;
public class SwitchCaseExample {
		public static void main(String main[]) 
		{
			Scanner sc=new Scanner(System.in);
			
			
			do {
				System.out.println("---------------------");
				System.out.println("1) Add two numbers\n"
						+"2) Find average of 2 numbers\n"
						+"3) Check even/odd\n"
						+"4) Check positive or negative number\n"
						+"5) check prime no or not \n"
						+"6) Quit");
				System.out.println("Enter your option: ");
				int n=sc.nextInt();
			
					switch(n) {
					case 1: 
						System.out.println("Enter two numbers");
						int num1 = sc.nextInt();
						int num2 = sc.nextInt();
						int sum = num1+num2;
						System.out.println("Sum: "+sum);
						break;
					case 2: 
						System.out.println("Enter two numbers");
						float n1 = sc.nextInt();
						float n2 = sc.nextInt();
						float avg = (n1+n2)/2;
						System.out.println("Average: "+avg);
						break;
					case 3: 
						System.out.println("Enter a number");
						int num = sc.nextInt();
						if(num%2==0)
						{
							System.out.println(num+" is even");
						}
						else
						System.out.println(num+" is odd");
					
						break;
					case 4: 
						System.out.println("Enter a number");
						int n11 = sc.nextInt();
						if( n11>0)
					{
						System.out.println(n11+" is positive");
					}else
						System.out.println(n11+" is negative");
						
							break;
					case 5: 
						System.out.println("Enter a number");
						int num11 = sc.nextInt();
						
						int m=0,flag=0;
						m=num11/2;    
						for(int i=2;i<=m;i++)    
						{    
							if(num11%i==0)    
							{    
								System.out.println(num11+" is not prime");    
								flag=1;    
								break;    
							}    
						}    
						if(flag==0)   { 
							System.out.println(num11+" is prime");      
						}    
						break;
					case 6:
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Option");
						
				}
			}while(true);
		}
}
