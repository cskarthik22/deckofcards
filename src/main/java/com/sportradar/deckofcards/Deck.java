package com.sportradar.deckofcards;

public class Deck implements IDeck {
	
    Card[] cards;
    public Deck()
    {   
        int index = 0;
        cards = new Card[DECK_SIZE];
        for ( SUITS s : SUITS.values()) {
            for ( RANKS r : RANKS.values()) {
                cards[index++]=new Card(s.toString(),r.getVal().toString(), index);
            }
        }
         
    }
    
    public void DisplayCards(){
        
        for(int i=0;i<DECK_SIZE;i++){
          
           System.out.println( "cards["+i+"] = " + cards[i].rank + " " + cards[i].suit );
        }
    }
    
    public void shuffle(int r){
        
        int a = 53; // (a-1) should be divisible by all prime factors of DECK_SIZE and (a-1)mod4=0
        int c = 3; // c & DECK_SIZE should not have no common factors
        for (int i = 0; i < DECK_SIZE; i++) {
          r = (a * r + c) % DECK_SIZE;    //  Linear Congruential Sequences
          CommonUtils.swap(cards,i,r);
        }
        
    }

}
