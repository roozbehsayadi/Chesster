package ChessGame.ChizaayeMohrehaa.SpecificMohre;

import BasicClasses.Cord;
import ChessGame.Board;
import ChessGame.ChizaayeMohrehaa.Mohre;
import Enums.Color;

import java.util.ArrayList;

public class Asb extends Mohre {

	public Asb(Color color, Cord cord ) {
		super( color, cord );
	}

	public Asb( Color color, Cord cord, boolean isMoved ) {
		super( color, cord, isMoved );
	}

	@Override
	public ArrayList<Cord> getValidDests(Board board, boolean isKishImportant) {
		int x = this.getCord().getX(), y = this.getCord().getY();
		ArrayList < Cord > returnValue = new ArrayList < Cord > ();
/*	    for ( int i = -2; i <= 2; i++ )
	    	for ( int j = -2; j <= 2; j++ ) {
	    		if ( Math.abs( i ) == Math.abs( j ) || i == 0 || j == 0 )
	    			continue;
	    		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x + i, y + j ), isKishImportant );
			}
		return returnValue;*/
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x - 2, y - 1 ), isKishImportant );
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x - 1, y - 2 ), isKishImportant );
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x + 1, y - 2 ), isKishImportant );
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x + 2, y - 1 ), isKishImportant );
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x + 2, y + 1 ), isKishImportant );
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x + 1, y + 2 ), isKishImportant );
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x - 1, y + 2 ), isKishImportant );
		this.addCorToValidCors( board.getCopy(), this, returnValue, new Cord( x - 2, y + 1 ), isKishImportant );

		return returnValue;

	}

	@Override
	public char symbol() {
		return ( this.getColor() == Color.WHITE ? 'N' : 'n' );
	}

	@Override
	public String label() {
		return "asb";
	}

	@Override
	public Asb getCopy() {
		return new Asb( this.getColor(), this.getCord().getCopy(), this.isMoved() );
	}

}
