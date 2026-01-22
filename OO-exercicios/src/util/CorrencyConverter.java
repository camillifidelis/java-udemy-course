package util;

public class CorrencyConverter {

	public static final double IOF = 0.06;
	
	public static double coversao (double dolar, double valor) {
		return (dolar * valor) * IOF + (dolar * valor);
	}
}
