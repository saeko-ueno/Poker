package com.example.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card {
    private int number;
    private int Mark;
    List<String> cards = new ArrayList<>();
    String marks[] = {"spade", "clover", "heart", "diamond"};
    List<String> hand = new ArrayList<>();



//    private String Card;

    public Card() {
        Random random = new Random();
        number = random.nextInt(13) +1;
        Mark = random.nextInt(4);
//        Card = String.valueOf(this.number) + String.valueOf(this.Mark);

        for (String mark: marks) {
            for (int i = 1; i <= 13; i++) {
                cards.add(mark + i);
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public int getMark() {
        return Mark;
    }

    public List getCard() {
        return cards;
    }


    public String draw() {
            Collections.shuffle(cards);
            String result = cards.get(0);
            return result;
        }


    public List<String> draw5() {
        while (hand.size() < 5) {
            Collections.shuffle(cards);
            
            hand.add(cards.get(0));
        }
        return hand;
    }
}

