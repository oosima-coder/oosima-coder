package loop;

public class Task5 {
	public static void main ( String[] args ) { 
		for ( int x = 1; x <= 9; x++ ) { 
			for ( int y = 1; y <= 9; y++ ) {
				if( x * y < 10 )
					System.out.print( " " ); 
				System.out.print ( x * y + " " );
			} 
			System.out.println ( );

		}
	}
}