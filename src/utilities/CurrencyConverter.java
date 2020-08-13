package utilities;

public class CurrencyConverter {
	
	private static final double IOF = 1.06;
	
	
	public static double converter(double dollarPrice, double amount) {
		return amount * dollarPrice * IOF;
	}

}
