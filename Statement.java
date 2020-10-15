import java.util.Enumeration;

public abstract class Statement {

    protected abstract  String getResultName(String name);

    protected abstract  String getResultMovieData(String movieTitle, String charge);

    protected abstract  String getResultOwed(String totalCharge);

    protected abstract String getResultEarned(String totalFrequentRenterPoints);

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