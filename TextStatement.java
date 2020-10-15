import java.util.Enumeration;

public class TextStatement extends Statement {

   private String getResultName(String name){
      return "Rental Record for " + name + "\n";
   }

   private String getResultMovieData(String movieTitle, String charge){
      return "\t" + movieTitle + "\t" + charge + "\n";
   }

   private String getResultOwed(String totalCharge){
      return "Amount owed is " + totalCharge + "\n";
   }

   private String getResultEarned(String totalFrequentRenterPoints){
      return "You earned " + totalFrequentRenterPoints + " frequent renter points";
   }

   public String value(Customer aCustomer) {
      Enumeration<Rental> rentals = aCustomer.getRentals();
      String result = getResultName(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += getResultMovieData(each.getMovie().getTitle(),String.valueOf(each.getCharge()));
      }
      //add footer lines
      result += getResultOwed(String.valueOf(aCustomer.getTotalCharge()));
      result += getResultEarned(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
      return result;
   }

}