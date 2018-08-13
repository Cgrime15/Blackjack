package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Card card1 = new Card(10);
        //System.out.println(card1.getValue());
        Deck deck1 = new Deck();
        deck1.shuffle();
        Hand hand1 = new Hand(deck1.dealCard(), deck1.dealCard());
        Hand dealer = new Hand(deck1.dealCard(), deck1.dealCard());
        boolean dealerBust = false;
        boolean hand1Bust = false;

        System.out.println("Hand 1 has " + hand1.handValue());

        while (hand1.handValue() < 17) {
            hand1.hitCard(deck1.dealCard());
            System.out.println("Hand 1 now has " + hand1.handValue());

            if (hand1.handValue() > 21) {
                //System.out.println("You Bust");
                hand1Bust = true;
            }
        }

        System.out.println("Dealer has " + dealer.handValue());

        while (dealer.handValue() < 17) {
            dealer.hitCard(deck1.dealCard());
            System.out.println("Dealer now has " + dealer.handValue());

            if (dealer.handValue() > 21) {
                //System.out.println("Dealer Bust");
                dealerBust = true;
            }
        }

        if (hand1Bust) {
            System.out.println("You Lost by busting with a " + hand1.handValue());
        } else if (dealerBust) {
            System.out.println("You win! The dealer busted with a " + dealer.handValue());
        } else if (hand1.handValue() > dealer.handValue()) {
            System.out.println("You win! You had " + hand1.handValue() + " dealer had " + dealer.handValue());
        } else
            System.out.println("You lost! You had " + hand1.handValue() + " dealer had " + dealer.handValue());


    }
}
