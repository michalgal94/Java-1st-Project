import javax.swing.JOptionPane;

public class HW1_MichalGal {

	public HW1_MichalGal() {
		// TODO Auto-generated constructor stub
		
		 int confirm =0;
		    
    	 // the "do" statement holds the whole game
    	 
    	 do { 
             JOptionPane.showMessageDialog(null, "guess play") ;

             String player1 = JOptionPane.showInputDialog("the first player is :") ;	 
	
             String player2 = JOptionPane.showInputDialog("the second player is :" );
	 
             int num1=0;
	         int num2=0;
	         int num3=0;
	     
	         boolean differentnumbers= false  ; // the boolean checks if all the numbers are different from each other
   
	         
             while  (differentnumbers==false) {	// the loop runs until all the numbers are different from each other 
            	 
                 num1 = 1 + (int)(Math.random() * 5) ;
	             num2 = 1 + (int)(Math.random() * 5) ;
                 num3 = 1 + (int)(Math.random() * 5) ;
	
	             if (num1 == num2 || num2==num3 || num1 == num3);
		
               	 else differentnumbers=true;
             }
		
              String ask = JOptionPane.showInputDialog("for train mode - \n"
			     + "how many numbers would you like to chosse? \n"
			     + "for one press 1 \n"
			     + "for two press 2 \n"
		         + "for three press 3 \n"
		         + "if you dont want to choose at all press cancel"  );
	
              while (ask !=null) { // runs until the player pressed cancel and entered a null argument
    	
                 if (ask.equals("1") || ask.equals("2") || ask.equals ("3")) {
                     switch (ask) {  // prints quantity of the numbers according to player's choice
                         case "1": System.out.println(num1) ; break;//
                         case "2": System.out.println(num1 + "," + num2) ; break;
                         case "3" :System.out.println(num1 + "," + num2+ "," + num3  ) ; 
                         break;
                     }
                     ask = null ; // if the player entered invalid number or word ,ask resets to null and the register starts from beginning
                     
                 }
                 else { 
    	             ask = JOptionPane.showInputDialog("you entered a wrong number \n, please try again \n " 
    		             + "how many numbers would you like to chosse? \n"
    			         + "for one press 1 \n"
    			         + "for two press 2 \n"
    		           	 + "for three press 3 \n"
    			         + "if you dont want to choose at all press cancel"  );
    	
    	
                 }
               }
    
     
               boolean winner = false ; // the boolean checks if one of the players won 
               int number1 =0 ;
               int number2 =0 ;
               int number3 =0 ;
    	       int counter = 0 ;
    	       while (!winner) { // the loop runs until someone wins
    		       if (winner== false) { //This if holds the turn of the first player, and it runs every  time the winner variable is false (if there is no winner) 
    		           counter=0; // the counter resets every round 
    		           JOptionPane.showMessageDialog(null, "player1");
    	               number1 = Integer.parseInt (JOptionPane.showInputDialog(player1 + " - choose the first number "));     
     	               number2 = Integer.parseInt (JOptionPane.showInputDialog(player1 + " - choose the second number "));
    	               number3 = Integer.parseInt (JOptionPane.showInputDialog(player1 + " - choose the third number ")); 
    	 
    	
                       if (number1 == num1 || number1 == num2 || number1 == num3 ) 
    		                counter++ ;
	
		               if (number2 == num1 || number2 == num2 || number2 == num3 )
			                counter++ ;
		
		               if (number3 == num1 || number3 == num2 || number3 == num3 )
			                counter++ ;
					
					 JOptionPane.showMessageDialog(null, "you've succeeded to guess right : " + counter);
					 if (counter ==3 ) {
						confirm = JOptionPane.showConfirmDialog(null, "congragulations player1 , you are the winner ! \n "
								+ " would you like to play one more time? " ) ;
						winner=true;

		            }
		            }
    	
    	
		          if (winner== false) // The if holds the turn of the second player, and it runs every time the winner variable is false (if there is no winner)
		           {
			
		
	             counter = 0 ;
		        JOptionPane.showMessageDialog(null, "player2");
	             number1 = Integer.parseInt (JOptionPane.showInputDialog(player2 + " - choose the first number "));     
	             number2 = Integer.parseInt (JOptionPane.showInputDialog(player2 + " - choose the second number "));
	             number3 = Integer.parseInt (JOptionPane.showInputDialog(player2 + " - choose the third number ")); 
	 
	  
	
	             if (number1 == num1 || number1 == num2 || number1 == num3 ) 
	            	 counter++ ;

	             if (number2 == num1 || number2 == num2 || number2 == num3 )
					counter++ ;
				
				 if (number3 == num1 || number3 == num2 || number3 == num3 )
					counter++ ;
				
				  JOptionPane.showMessageDialog(null, "you've succeeded to guess right : " + counter);
				 if (counter ==3 ) {
		             confirm = JOptionPane.showConfirmDialog(null, "congragulations player2 , you are the winner ! \n "
			 	      + " would you like to play one more time? " ) ;
		            winner= true ; 

				 }
		           }
    	       }
    	 		}
    	 
    	 
                while(confirm ==JOptionPane.YES_OPTION
                		); /* the loop runs as long as the confirm variable is Yes. Once the player clicks on "no" or "cancel" the confirm variable is getting
    	        a different value (1 for no, and 2 for cancel). Then the loop ends.*/

    	 		JOptionPane.showMessageDialog(null, "game over") ; 
	}

}
