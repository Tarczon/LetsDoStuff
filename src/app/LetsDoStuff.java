package app;

public class LetsDoStuff {

	public LetsDoStuff( ) {
		System.out.println( "Let's Do Some Stuff!" );
	}

	public static void main( String[] args ) {
		try {
			LetsDoStuff app = new LetsDoStuff( );
			System.out.println("Hello World!");
		} catch ( Exception e ) {
			System.out.println( "Unhandled Exception Occurred:" );
			e.printStackTrace();
		}

	}

}
