package prob03;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
		
	}

	public static double toDollar(double d) {
		
		return d/rate;
	}

	public static double toKRW(double d) {
		
		return rate*d;
	}
}
