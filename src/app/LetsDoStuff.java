package letsdostuff;

import java.util.*
import letsdostuff.util.*

public class LetsDoStuff {

	public LetsDoStuff( ) {
		System.out.println( "Let's Do Some Stuff!" );
	}

	public static void main( String[] args ) {
		try {
			LetsDoStuff app = new LetsDoStuff( );
		} catch ( Exception e ) {
			system.out.println( "Unhandled Exception Occurred:\n" + e.printStackTrace( ) );
		}

	}

}
