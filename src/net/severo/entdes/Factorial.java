package net.severo.entdes;
/**
 * 
 * @author Carmelo Nieto Domene
 *
 */
public class Factorial {

	public static final String VALUE_OF_N = "Value of n: ";
	public static final String VALUE_OF_N1 = "Value of n!: ";

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println(VALUE_OF_N + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(VALUE_OF_N1 + result);

	}

}
