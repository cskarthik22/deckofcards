package com.sportradar.deckofcards;

public interface IDeck {

	static final int DECK_SIZE = 52;
	enum SUITS { 
	        DIAMOND(1), CLUB(2), HEART(3), SPADE(4); 
	        SUITS (int val) {
	            this.val=val;
	        }
	        private int val;
	        public int getVal(){
	           return val;
	        }
	       
	    }

	enum RANKS { 
	        ACE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), 
	        EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K");
	        RANKS (String val) {
	            this.val=val;
	        }
	        private String val;
	        public String getVal(){
	           return val;
	        }
	       
	    }
	    // (a-1) should be divisible by all prime factors of n and (a-1)mod4=0
	
	    void shuffle(int seed);
	    void DisplayCards();
}
