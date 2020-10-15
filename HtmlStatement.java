
public class HtmlStatement extends Statement {

   protected String getResultName(String name){
      return "<H1>Rentals for <EM>" + name +"</EM></H1><P>\n";
   }

   protected String getResultMovieData(String movieTitle, String charge){
      return movieTitle + ": " + charge + "<BR>\n";
   }

   protected String getResultOwed(String totalCharge){
      return "<P>You owe <EM>" + totalCharge + "</EM><P>\n";
   }

   protected String getResultEarned(String totalFrequentRenterPoints){
      return "On this rental you earned <EM>" + totalFrequentRenterPoints + "</EM> frequent renter points<P>";
   }

}