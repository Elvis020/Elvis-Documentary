package com.elvis_andJoshua.training;

import java.util.ArrayList;
import java.util.List;

public class Player {
    protected String name;
    List<Integer> scores =  new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void getTotal(){}

    public void add_cards(Card card1){
        List<Card> list_of_cards_added = new ArrayList<>();
        list_of_cards_added.add(card1);
        list_of_cards_added.forEach(x -> System.out.print(x.type+x.Suite+" "));
    }
}
