import java.util.*;
class Roman{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Roman Letter ");
		String	s1=sc.nextLine();
		int total=0;	
		int arr[]=new int[s1.length()];
		for(int i=0;i<s1.length();i++){
			int s=s1.charAt(i);			
			if(s=='I'){
				int a=1;
				arr[i]=a;
				
			}
			else if(s=='V'){
				int a=5;
				arr[i]=a;

				
			}

			else if(s=='X'){
				int a=10;
				arr[i]=a;

			}
			else if(s=='L'){
				int a=50;
				arr[i]=a;

			}
			else if(s=='C'){
				int a=100;
				arr[i]=a;

			}
			else if(s=='D'){
				int a=500;
				arr[i]=a;

			}
			else if(s=='M'){
				int a=1000;
				arr[i]=a;

			}			
		
				
		
		}
		for (int i = 0; i < arr.length; i++) {
           		 if (i + 1 < arr.length && arr[i] < arr[i + 1]) {
                                total =total- arr[i];
           		 } else {
                            total =total+ arr[i];
           		 }
        	}

        System.out.println("The Integer Value is " + total);
    }
}