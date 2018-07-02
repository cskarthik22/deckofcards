package com.sportradar.deckofcards;

public class CommonUtils {
	 static final int DECK_SIZE = 52;
	
	 static void swap(Card[] cards, int a, int b)
	    {
	        Card temp;
	        temp = cards[a];
	        cards[a] = cards[b];
	        cards[b] = temp;
	    }
	 static void MaxHeapify(Card[] heap, int index, int size)
	    {
	        int left = 2*index + 1, right=2*index+2, greatest=index;
	        greatest = (left<size && heap[left].id>heap[index].id)? left: index;
	        if (right < size && heap[right].id>heap[greatest].id)
	        greatest = right;
	        if (greatest != index)
	        {
	        swap(heap, index, greatest);
	        MaxHeapify(heap, greatest, size);
	        }
	    }
	    
	 static void convertToMaxHeap(Card[] heap)
	    {
	        for(int i=(DECK_SIZE/2)-1; i >= 0; i--)
	        MaxHeapify(heap, i, DECK_SIZE);
	       
	    }
	    
	  static void heapSort(Card[] heap) {
	      // Build our max heap.
	      convertToMaxHeap(heap);
	      
	        for(int i=DECK_SIZE - 1; i>0; i-- )
	        {
	           swap(heap,0,i);
	           MaxHeapify(heap, 0, i);
	           
	        }
	    }

}
