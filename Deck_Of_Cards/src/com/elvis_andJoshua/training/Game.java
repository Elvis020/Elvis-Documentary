package com.elvis_andJoshua.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

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
        List<String> suits = Arrays.asList("\uD83E\uDDE1 ","\uD83D\uDD36","♠","♣");
        List<String> types = Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A");
        for(String suit: suits){
            for (String type: types){
                cards_list.add(new Card(suit,type));
            }
        }

        List<Card> hearts_array = cards_list.subList(0,13);
        List<Card> diamonds_array = cards_list.subList(14,26);
        List<Card> spade_array = cards_list.subList(27,39);
        List<Card> clubs_array = cards_list.subList(40,52);




        Collections.shuffle(hearts_array);

        int randomNumber = (int) (Math.random() * 12);
        int randomNumber2 = (int) (Math.random() * 12);

        if(randomNumber != randomNumber2){
            System.out.println(hearts_array.subList(0,12).get(randomNumber).type + hearts_array.subList(0,12).get(randomNumber).Suite);
            System.out.println(hearts_array.subList(0,12).get(randomNumber2).type + hearts_array.subList(0,12).get(randomNumber2).Suite);
        }

//        for(Card x: hearts_array){
//            System.out.print(x.type+x.Suite+ " ");
//        }
//        System.out.println();
//
////        Adding the players
//        List<Player> player_list = Arrays.asList(Elvis,Joshuah,Debrah);
//
////        Adding cards to players
//        Elvis.add_cards(cards_list.get(3));
//        Elvis.add_cards(cards_list.get(4));

        //        System.out.println(cards_list.subList(0,12).get(1).type + cards_list.subList(0,12).get(1).Suite);
//        System.out.println(cards_list.subList(13,25).get(1).type + cards_list.subList(13,25).get(1).Suite);
//        System.out.println(cards_list.subList(26,38).get(1).type + cards_list.subList(26,38).get(1).Suite);
//        System.out.println(cards_list.subList(39,52).get(1).type + cards_list.subList(39,52).get(1).Suite);
        //        for(Card x: cards_list){
//            System.out.print(x.type+x.Suite+ ", ");
//        }
//        System.out.println();

    }
}
