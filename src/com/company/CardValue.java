package com.company;

public enum CardValue {
    ACE,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public int getCardBlackjackValue() {
        return CardValue.getCardBlackjackValue(this);
    }

    public static int getCardBlackjackValue(CardValue c) {
        switch (c) {
            case ACE:
                return 11;
            case ONE:
                return 1;
            case TWO:
                return 1;
            case THREE:
                return 1;
            case FOUR:
                return 1;
            case FIVE:
                return 1;
            case SIX:
                return 1;
            case SEVEN:
                return 1;
            case EIGHT:
                return 1;
            case NINE:
                return 1;
            case TEN:
                // fall through
            case JACK:
                // fall through
            case QUEEN:
                // fall through
            case KING:
                return 10;
            default:
                return 1;
        }
    }


}
