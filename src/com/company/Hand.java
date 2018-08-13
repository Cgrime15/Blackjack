package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand = new ArrayList<Card>();

    public Hand(Card card1, Card card2) {
        hand.add(card1);
        hand.add(card2);
    }

    public int handValue() { // does not take into account aces aces are always 11 for now
        int value = 0;
        int aces = 0;
        for (int i = 0; i < hand.size(); i ++ ) {
            value += hand.get(i).getValue();
            //System.out.println("The card was a " + hand.get(i).getValue());
        }



        return value;
    }

    public void hitCard(Card card) {
        hand.add(card);
    }


}






