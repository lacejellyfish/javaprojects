/*
   part2Client.java: Tosses 2 coins 50 times each and records results.
                     Records and reports how many each coin lands heads up.
                     Reports which coin lands heads up most often.
*/

public class part2Client extends GenericCoin
{
   //class fields (2 coins)
   private String coin1, coin2;

   //Main method
   public static void main(String[] args)
   {
      //Objects of superclass GenericCoin
		GenericCoin coin1 = new GenericCoin();
      GenericCoin coin2 = new GenericCoin();
      
      //variables to count how many times each coin lands headsup
      int coin1heads = 0;
      int coin2heads = 0;
      String mostheads;
      
      //For loop tosses each coin 50 times and records how many times each coin landed heads up
      for (int i = 0; i <= 50; i++)
      {
        
        //Call "toss" method to toss both coins
        coin1.toss();
        coin2.toss(); 
       
        /** 	Record how many times each coin lands heads up.  
        	      If coin 1 lands on heads, add 1 to "coin1heads"
        	      If coin 2 lands on heads, add 2 to "coin1heads"
        */
        coin1heads += (coin1.getSideUp().equals("heads")) ? 1 : 0;
        coin2heads += (coin2.getSideUp().equals("heads")) ? 1 : 0;
      }//end of for loop
     
      //Determine the coin with the most heads
      mostheads = (coin1heads > coin2heads) ? "Coin 1" : "Coin 2";

      //Report how many times each coin lands heads up
      System.out.println("Coin 1 landed on heads " + coin1heads + " times.");
      System.out.println("Coin 2 landed on heads " + coin2heads + " times.");
      System.out.println(mostheads + " landed on heads the most.");

   
   }//end main method coinClient


   /* TEST OUTPUT
        Coin 1 landed on heads 22 times.
       Coin 2 landed on heads 32 times.
      Coin 2 landed on heads the most.
   
        Coin 1 landed on heads 28 times.
      Coin 2 landed on heads 17 times.
        Coin 1 landed on heads the most.
   */
   

}//end class refresherClient