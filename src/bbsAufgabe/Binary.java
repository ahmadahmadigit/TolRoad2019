package bbsAufgabe;

public class Binary {

	public static void main(String[] args) {
				
		//Second Commit
		
		 int a = 0, remainder = 0;
		 
		int [] binary1= new int [4];
		
		int [] binary2= new int [4];
		
		int[] sum = new int[20];
		
		int b1=0;
		int b2=0;
	
		
			for(int i=0 ; i<=3 ; i++) {
				
				binary1[i]=IO.readInt("bitte geben Sie ihre binary Zahl ein :");
				
				b1=binary1[i];
				b1++;

			}
			
		
			for(int i=0 ; i<=3 ; i++) {
				
				binary2 [i]=IO.readInt("bitte geben Sie ihre zweite binary Zahl ein :");
				
				b2=binary2[i];
			}
			
			for(int i=0 ; i<=3 ; i++) {
				
				System.out.print("Erste binary nummer : "+binary1[i]);
			}
			
			for (int i=0 ; i<=3 ; i++ ) {
				
				System.out.print("Zweite binary nummer : "+binary2[i]);
				
			}
			
			
			
			
	}

}
