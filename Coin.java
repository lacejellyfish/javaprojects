/*
   Coin.java: represents a coin with no value or name.
              This coin can be tossed.

Inherits GenericCoin class.
Contains:
   double value
   String type
   no-arg default constructor
      Can be tossed.
   constructor with parameters: (v: double, t: String)
   
   Accessor/Mutator methods:
   getValue()
   getType()
   toString()
   -Any other methods to make the class functional.


*/

public class Coin extends GenericCoin
{
   //fields
   private double value;
   private String type;

   /*
      Default no-arg constructor
   */
   Coin()
   {
   
   }

   /*
      Constructor to overload
      @param value: double, type: String
   */
   Coin(double value, String type)
   {
      this.value = value;
      this.type = type;
   }
   
   /*
      Gets the value
      @return double
   */
   public double getValue()
   {
      return this.value;   //changed from value to this.value
   }
   
   /*
     Gets the type
     @return String
   */
   public String getType()
   {
      return this.type; //changed from type to this.type
   }
   
   /*
     toString method
     @return String
   */
   public String toString()
   {
      return this.type; //Returns type of coin when coin is called for printing
   }



}//end class Coin