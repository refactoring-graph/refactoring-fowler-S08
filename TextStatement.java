
public class TextStatement extends Statement {

   protected String getResultName(String name){
      return "Rental Record for " + name + "\n";
   }

   protected String getResultMovieData(String movieTitle, String charge){
      return "\t" + movieTitle + "\t" + charge + "\n";
   }

   protected String getResultOwed(String totalCharge){
      return "Amount owed is " + totalCharge + "\n";
   }

   protected String getResultEarned(String totalFrequentRenterPoints){
      return "You earned " + totalFrequentRenterPoints + " frequent renter points";
   }

}