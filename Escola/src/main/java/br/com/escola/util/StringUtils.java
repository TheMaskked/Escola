package br.com.escola.util;

/**
 * Utilit�rios de Strings
 */
public class StringUtils {

	/**
	 * Verifica se uma String � composta apenas por caracteres num�ricos
	 */
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

	/**
	 * Retorna o inverso da String
	 */
	public static String reverse(String str) {
		if (str == null) {
			return str;
		}

		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}

	/**
	 * Verifica se a String � vazia ou composta apenas por espa�os em branco
	 * @param str String a ser verificada
	 * @return true se vazia; false caso contr�rio
	 */
	public static final boolean isEmpty(String str) {
		if (str == null) {
			return true;
		}

		return str.trim().length() == 0;
	}

	/**
	 * Retorn o separador de linha usado pelo sistema operacional
	 * @return
	 */
	public static String newLine() {
		return System.getProperty("line.separator");
	}
}
