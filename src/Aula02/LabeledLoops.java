package Aula02;

public class LabeledLoops {

	public static void main(String[] args) {
		
			primeiroloop: 				// Labeled Loop 1
			for(int i=0;i<10;i++){
				
				segundoloop:			// Labeled Loop 2
				for(int j=0;j<10;j++){
			      
				   if(j == 2){
			    	  
			    	  System.out.println(j);
			    	  System.out.println(i);
			    	  
			    	  break primeiroloop;
			      }
			   }
			}
	}
}
