/*
   part5Client.java: This program....
                     -Creates 3 coins (nickel, dime quarter)
                     -Tosses all 3 coins.
                           -If the coin lands on heads: add the value of the coin to the balance and print what type of coin was added to the balance.
	                  -Stops tossing when the balance is equal or greater than a dollar.

*/


public class part5Client extends Coin
{
	//class fields (3 coins)
	private String nickel, dime, quarter;

	//main method
	public static void main(String[] args)
	{
		//Objects of superclass Coin (double value, String type)
		Coin nickel = new Coin(0.05, "Nickel");
		Coin dime = new Coin(0.10, "Dime");
		Coin quarter = new Coin(0.25, "Quarter");

		//Balance variable
		double balance = 0;

		//Loop stops when balance is equal to or greater than a dollar
		while(balance < 1.0){
			//toss all 3 coins
			nickel.toss(); 
			dime.toss();
			quarter.toss();

			//If nickel lands on heads, add its value to the balance and print that it was added to the balance.
			if (nickel.getSideUp().equals("heads"))
			{
				balance += (nickel.getValue()); //add coin value to balance
				System.out.println(nickel.getType() + " was added to balance.");
			}

			//If dime lands on heads, add its value to the balance and print that it was added to the balance.
			if (dime.getSideUp().equals("heads"))
			{
				balance += (dime.getValue()); //add coin value to balance
				System.out.println(dime.getType() + " was added to balance.");
			}

			//If quarter lands on heads, add its value to the balance and print that it was added to the balance.
			if (quarter.getSideUp().equals("heads"))
			{
				balance += (quarter.getValue()); //add coin value to balance
				System.out.println(quarter.getType() + " was added to balance.");
			}

		}//end while loop
		
      //Print the balance to confirm it is $1 or higher
      System.out.printf("The balance is: $%.2f", balance);

	}//end of main

   /* TEST OUTPUT
           Nickel was added to balance.
          Dime was added to balance.
         Quarter was added to balance.
         Dime was added to balance.
         Nickel was added to balance.
         Dime was added to balance.
         Quarter was added to balance.
         Dime was added to balance.
         The balance is: $1.00
       
         Dime was added to balance.
         Quarter was added to balance.
         Nickel was added to balance.
         Dime was added to balance.
         Quarter was added to balance.
         Nickel was added to balance.
         Quarter was added to balance.
         The balance is: $1.05
   */

}//end part5Client