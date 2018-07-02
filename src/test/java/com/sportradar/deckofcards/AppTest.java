package com.sportradar.deckofcards;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest 
    
{
	// Deck initialization
	Deck expectedDeck = new Deck(); 
	static final int SECONDS=60;
    @Test
    public void TestDeckSize()
    {
    	assertEquals(expectedDeck.cards.length,52);  
    }
     
    @Test
    public void TestCardsStateBeforeShuffle()
    {
    	for (int i=0; i<expectedDeck.cards.length;i++)
    	{
    		assertNotNull(expectedDeck.cards[i]);
    	}	
    }
    
    @Test
    public void TestCardsStateAfterShuffle()
    {
      Deck currentDeck = new Deck();
       for(int seed=1; seed<=SECONDS; seed++) {
    	   currentDeck.shuffle(seed);
	    	for (int i=0; i<currentDeck.cards.length;i++)
	    	{
	    		assertNotNull(currentDeck.cards[i]);
	    	}
       }
    		
    }
    
    @Test
    public void TestFinalResultAfterShuffle()
    {
    	Deck currentDeck = new Deck();
	    for(int seed=1; seed<=SECONDS; seed++) {
	    	currentDeck.shuffle(seed);
	    	CommonUtils.heapSort(currentDeck.cards);
	    	for (int i=0; i<currentDeck.cards.length;i++)
	    	{
	    		assertEquals(currentDeck.cards[i].rank, expectedDeck.cards[i].rank);
	    		assertEquals(currentDeck.cards[i].suit, expectedDeck.cards[i].suit);
	    		assertEquals(currentDeck.cards[i].id, expectedDeck.cards[i].id);
	    	}
	    }
    }
     
    
}
