/*
   GenericCoin.java: represents a coin with no value or name.

Methods:
toss(): Can toss coin so it randomly lands on heads or tails
getSideUp(): Returns what side of the coin is up

*/
import java.util.Random;

public class GenericCoin implements CoinInterface
{
   //class fields
   private String sideUp;
   Random random = new Random(); //Random object necessary for random int generator
   
   /** 
      Default no-arg constructor
   */
   public GenericCoin()
   {
      
   }//end no-arg constructor
   
   /** 
       Method for tossing coin.
       @return  void
   */
   public void toss()
   {
	   int randomnum = random.nextInt(2); //generates a 0 or 1 (2 exclusive)
      
      //If the random number is 0, sideUp = "tails"
      //If the random number is not 0, sideUp "heads"
      sideUp = (randomnum == 0) ? "tails" : "heads";
   }

   /** 
       Returns what side of the coin is up.
       @return  String
   */
   public String getSideUp()
   {
      //use this.sideUp?
      return sideUp;
   }
   
   
}//end class body   