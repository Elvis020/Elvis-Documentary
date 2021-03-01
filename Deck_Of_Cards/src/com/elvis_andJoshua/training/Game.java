package com.elvis_andJoshua.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    public static void main(String[] args) {
//        List<Card> cards_list = new ArrayList<>();
//        List<Player> player_list = new ArrayList<>();
        gen_and_shuffle_cards();
//        public void addPlayer(){}
    }
    public static void gen_and_shuffle_cards(){

        Player Debrah = new Player("Debrah");
        Player Joshuah = new Player("Joshuah");
        Player Elvis = new Player("Elvis");



//        Generatng the cards and shufflling them
        List<Card> cards_list = new ArrayList<>();
        List<Card> hearts = new ArrayList<>();
        hearts = cards_list;
        List<String> suits = Arrays.asList("\uD83E\uDDE1 ","\uD83D\uDD36","♠️","♣️");
        List<String> types = Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A");
        for(String suit: suits){
            for (String type: types){
                cards_list.add(new Card(suit,type));
            }
        }
//        Collections.shuffle(cards_list);
        for(Card x: cards_list){
            System.out.print(x.type+x.Suite+ ", ");
        }
        System.out.println();

//        Adding the players
        List<Player> player_list = Arrays.asList(Elvis,Joshuah,Debrah);

//        Adding cards to players
        Elvis.add_cards(cards_list.get(3));
        Elvis.add_cards(cards_list.get(4));

    }
}
