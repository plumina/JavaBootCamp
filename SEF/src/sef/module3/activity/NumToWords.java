/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for ( int i = 1; i < 11; i++ ) {
			System.out.println ( "The value of i is: " + i );
		}


				
		int i = 5;
		String numText ;
		switch(i) {
		case 1:
			numText = "ONE";
			break;
		case 2:
			numText = "TWO";
			break;
		case 3:
			numText = "THREE";
			break;
		case 4:
			numText = "FOUR";
			break;
		case 5:
			numText = "FIVE";
			break;
			case 6:
				numText = "SIX";
				break;
			case 7:
				numText = "SEVEN";
				break;
			case 8:
				numText = "EIGHT";
				break;
			case 9:
				numText = "NINE";
				break;
			case 10:
				numText = "TEN";
				break;
			// complete the code.

		default:
			numText = "NUMBER " + i;

		}

		System.out.println(numText);


	}
	

}
