package com.elvis.training_with_Java;

import java.util.Optional;

public class Client {
    protected String firstName;
    protected String lastName;
    public MembershipType membershipStatus;
    private Integer numberOfTrades;
    private int points = 0;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        membershipStatus = new MembershipType();
        System.out.println("Client Created");
    }


    public void addTrade(Trade trade){
        switch(points){
            case 0:
                membershipStatus = new Bronze();
                points++;
                break;
            case 9:
                membershipStatus = new Silver();
                points++;
                break;
            case 19:
                membershipStatus = new Gold();
                points++;
                break;
            default:
                points++;

        }
    }
    public boolean canTrade(Trade trade){
        if(membershipStatus.getMembershipType() == "Bronze" && points == 5){
            return false;
        }else if(membershipStatus.getMembershipType() == "Silver" && points == 10){
            return false;
        }
        else if(membershipStatus.getMembershipType() == "Gold" && points == 20){
            return false;
        }
        else
            return true;
    }


    public MembershipType getMembershipStatus(){
        return membershipStatus;
    }


    public Optional<MembershipType> getMembershipType(){
        if(points == 0){
            return Optional.empty();
        }else if(points < 10){
            return Optional.of(new Bronze());
        }else if(points >= 10 && points <=19){
            return Optional.of(new Silver());
        }else{
            return Optional.of(new Gold());
        }
    }



}
