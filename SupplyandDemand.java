import java.util.Scanner;

public class SupplyandDemand{
	public static void main (String[] args) {
 		Scanner scanboi = new Scanner(System.in);

 		System.out.println("Please name the first object");
 		String firstitem = scanboi.nextLine();
 		
 		System.out.println("Please name the second object");
 		String seconditem = scanboi.nextLine();
 		
 		System.out.println("Please type 1 if the objects can subsitute each other and 2 if one works with the other");
 		int sas = scanboi.nextInt();


 		if (sas == 1) { System.out.println("Please type 1 if the first object falls in value and 2 if the second object falls in value");
 			int value = scanboi.nextInt();

	 			if( value == 1 ){System.out.println("If "+ firstitem +" rises in price " + seconditem + " will rise in demand because they are subsitutes meaning they have similar value");
 	}
 				if( value == 2){System.out.println("if " + firstitem +" falls in price " + seconditem + " will fall in demand because they are subsitutes meaning they have similar value");
 		}
 				else{System.out.println("please choose between 1 and 2");
 	}
}
 		if (sas == 2) { System.out.println("Please type 1 if the first object falls in value and 2 if the second object falls in value");
 			int value = scanboi.nextInt();

 				if( value == 1 ){System.out.println(" If " + firstitem + " falls in price " + seconditem + " will rise in demand as they are complimentary goods meaning they go together") ;
}
 				if( value == 2 ){System.out.println(" If " + firstitem + " rises in price " + seconditem + " will fall in demand as they are complimentary goods meaning they go together");	
}
 				else{System.out.println("please choose between 1 and 2");
 	}

 			
		}	
 	}
 }
