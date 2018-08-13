package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<Card>();

    public Deck() {
        for (int suit = 0; suit < 4; suit++) {
            for (int type = 1; type < 14; type++) {
                Card card = new Card(type);
                deck.add(card);
                // System.out.println(card.getValue());
            }
        }
        //System.out.println("deck initialized");
    }

    public void shuffle() {
        Collections.shuffle(deck);  // shuffles the deck but I have no idea how
        //System.out.println("Test of shuffle should change when run " + deck.get(0).getValue());
    }

    public Card dealCard() {
        //System.out.println("Deck size before deal " + deck.size());
        return deck.remove(deck.size() -1); // finds last element in list, removes it and returns it
    }


}




