package br.com.escola.utils;

/**
 * Utilit�rios de Strings
 */
public class StringUtils {

	// Verifica se uma String � composta apenas por caracteres num�ricos
	public static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		}

		char[] chars = str.toCharArray();
		for (char c : chars) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;
	}

	// Retorna o inverso da String
	public static String reverse(String str) {
		if (str == null) {
			return str;
		}

		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}

	// Verifica se a String est� vazia
	public static boolean isEmpty(String str) {
		if (str == null) {
			return true;
		}

		str = str.trim();
		return str.length() == 0;
	}
}
