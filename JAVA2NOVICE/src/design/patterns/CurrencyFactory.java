package design.patterns;
interface Currency {	 
    public String getCurrency();    
    public String getSymbol();
}
class India implements Currency{
	public String getCurrency() {
		return "Rupee";
	}
	public String getSymbol() {
        
        return "Rs";
    }
}
class USA implements Currency{
    public String getCurrency() {      
        return "Dollar";
    } 
    public String getSymbol() {
         
        return "$";
    }
}
public class CurrencyFactory {
	 public static Currency getCurrencyByCountry(String cnty) throws Exception{
	        if("IN".equalsIgnoreCase(cnty)){
	            return new India();
	        } else if("USA".equalsIgnoreCase(cnty)){
	            return new USA();
	        }
	        throw new Exception("Invalid country...");
	    }     
	    public static void main(String a[]){
	        Currency india;
	       // Currency usa;
	        try {
	            india = CurrencyFactory.getCurrencyByCountry("IN");
	         //   usa =CurrencyFactory.getCurrencyByCountry("USA");
	            System.out.println("Indian currency: "+india.getCurrency());
	            System.out.println("Indian currency symbol: "+india.getSymbol());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
