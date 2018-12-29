package letsdostuff.util;

public static class StringUtils {

	/*
	 * Shorthand for sysout
	 */
	public static void print( String s ) {
		if ( null != s ) {
			System.out.println( s );
		} else {
			System.out.println( "" );
		}
	}

	/*
	 * Used for null-stafe whitespace trimming
	 */
	public static String clean( String s ) {
		if ( null != s ) {
			return s.trim( );
		} else {
			return "";
		}
	}

}
