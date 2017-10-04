
public class Prime {
	
	public static void main(String[] args) {
		
		int counter = 0;
		int treshold = 2000;
		int number = 2;
		boolean isPrime = true;

System.out.println("Primzahlen von 2 bis "+treshold+":");

 while(number<=treshold){
	for(int i=2; i<=number/2&&isPrime==true; i++){
		if(number%i==0){
			isPrime = false;
		}
	}
		if(isPrime==true){
			counter++;
			System.out.print(number+" ");
			if(counter%20==0){System.out.println();}  
		}
			
	
		number++;	
		isPrime = true;
		
		//else{System.out.println(number+" ");}
				
		}
	}

	}

