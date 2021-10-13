package blackjack;

import java.util.Hashtable;

public class TotalHandValues implements ITotalHandValues {

    private Hashtable<String,Integer> values;


    public TotalHandValues() {


        this.values = new Hashtable<String,Integer>();
        this.values.put("Two",2);
        this.values.put("Three",3);
        this.values.put("Four",4);
        this.values.put("Five",5);
        this.values.put("Six",6);
        this.values.put("Seven",7);
        this.values.put("Eight",8);
        this.values.put("Nine",9);
        this.values.put("Ten",10);
        this.values.put("Jack",10);
        this.values.put("Queen",10);
        this.values.put("King",10);
        this.values.put("Ace",11);


    }





    public int totalhandvalues(IHand hand){
        for(ICard card: hand.getHandOfCards()){
          hand.setValue(hand.getValue()+ values.get(card.getRank()));
        }
        while(hand.getValue()>21){
            for(ICard card: hand.getHandOfCards()){
                if(card.getRank().equals("Ace")){
                    hand.setValue(hand.getValue()-10);
                    break;
                }

            }

        }
        return hand.getValue();

    }


    public Hashtable<String, Integer> getValues() {
        return values;
    }
}
