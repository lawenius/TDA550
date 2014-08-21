/*
 * Copyright (c) 2014 Spotify AB
 */
package orig2011.v7;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 */
public class ReversiScoreView implements PropertyChangeListener {
	
	private ReversiModel.Turn lastSeenTurn = null;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (ReversiModel.class.equals(evt.getSource().getClass())) {
			final ReversiModel reversiModel = (ReversiModel) evt.getSource();
			final ReversiModel.Turn currentTurn = reversiModel.getTurnColor();
			if (!currentTurn.equals(this.lastSeenTurn)) {
				System.out.println("Black score: " + reversiModel.getBlackScore());
				System.out.println("White score: " + reversiModel.getWhiteScore());
				System.out.println("Next player: " + reversiModel.getTurnColor());
				this.lastSeenTurn = currentTurn;
			}
		}
	}

}
