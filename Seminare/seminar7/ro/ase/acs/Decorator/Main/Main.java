package ro.ase.acs.Decorator.Main;

import ro.ase.acs.Decorator.AbstractDecorator;
import ro.ase.acs.Decorator.Card;
import ro.ase.acs.Decorator.CardContactless;
import ro.ase.acs.Decorator.ICard;

public class Main {

	public static void main(String[] args) {
		ICard card = new Card();
		card.payOnline(1000);
		card.payPOS(2000);
		
		AbstractDecorator decorator = new CardContactless(card);
		decorator.payContactless(500);

	}

}
