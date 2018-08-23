package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CardTest {


    @Test
    void Should_get_card_Number_Test() {
        Assertions.assertTrue(1<=new Card().getNumber() && new Card().getNumber()<=13);
    }


    @Test
    void Should_get_card_Mark_Test() {
        Assertions.assertTrue(0<=new Card().getMark() && new Card().getMark()<=3);
    }


    @Test
    void draw1(){
        Card a = new Card();
        List<Card> cards = a.getCard();
        Assertions.assertTrue(cards.contains(a.draw()));
    }

    @Test
    void draw5(){
        Card a = new Card();
        List<Card> cards = a.getCard();
//        System.out.println(a.draw5());
        Assertions.assertTrue(cards.contains(a.draw5()));
    }

}