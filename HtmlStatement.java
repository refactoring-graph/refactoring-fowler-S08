import java.util.Enumeration;

public class HtmlStatement extends Statement {

   private String getResultName(String name){
      return "<H1>Rentals for <EM>" + name +"</EM></H1><P>\n";
   }

   private String getResultMovieData(String movieTitle, String charge){
      return movieTitle + ": " + charge + "<BR>\n";
   }

   private String getResultOwed(String totalCharge){
      return "<P>You owe <EM>" + totalCharge + "</EM><P>\n";
   }

   private String getResultEarned(String totalFrequentRenterPoints){
      return "On this rental you earned <EM>" + totalFrequentRenterPoints + "</EM> frequent renter points<P>";
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