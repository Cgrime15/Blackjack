package com.company;

public class Card {
    private int value; // i don't care about the suit, just the value of the card


    // This tests to make sure the value of the card is valid as you construct the card.

    public Card(int value) {
        if ((value > 10 ) && (value <= 13)) { // for jack queen and king give them value of 10
            this.value = 10;
        } else if (value < 1) {
            this.value = -1;
            System.out.println("Error card value too low ");
        } else if (value > 13) {
            this.value = -1;
            System.out.println("Error card value too high");
        } else if (value == 1) {
            this.value = 11;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }
}
