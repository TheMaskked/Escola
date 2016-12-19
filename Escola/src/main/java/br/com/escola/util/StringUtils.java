package br.com.escola.util;

/**
 * Utilitários de Strings
 */
public class StringUtils {

	/**
	 * Verifica se uma String é composta apenas por caracteres numéricos
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
	 * Verifica se a String é vazia ou composta apenas por espaços em branco
	 * @param str String a ser verificada
	 * @return true se vazia; false caso contrário
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
