package Week3;
//import java.util.Scanner;
public class Week3 {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			if(i==5) {
				System.out.println("");
				break;
			}
			
			for(int j = 1; j < 10; j++) {
				
				System.out.print(i+"*"+j+"="+(i*j)+" ");;
				if(i*j<10) {
					System.out.print(" ");
				}	
				
			}
			
			System.out.println("");
		}
		
	}
	
}

