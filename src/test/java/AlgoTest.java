package test.java;

import static org.junit.Assert.*;
import main.java.Item;

import org.junit.Test;
import main.java.*;

public class AlgoTest {

	@Test
	//Node coverage and Condition coverage
	public void BubbleSorttestforDescending() {
		
		Item[] numbers = new Item[6];
		Item[] sortedNumbers =  new Item[6];
		numbers[0]= new Item(100);
		numbers[1]= new Item(90);
		numbers[2]= new Item(80);
		numbers[3]= new Item(70);
		numbers[4]= new Item(60);
		numbers[5]= new Item(50);
		sortedNumbers[0]= new Item(50);
		sortedNumbers[1]= new Item(60);
		sortedNumbers[2]= new Item(70);
		sortedNumbers[3]= new Item(80);
		sortedNumbers[4]= new Item(90);
		sortedNumbers[5]= new Item(100);
		SortAlgos.bubbleSort(numbers);
		assertEquals(numbers[0].key,sortedNumbers[0].key);
		assertEquals(numbers[1].key,sortedNumbers[1].key);
		assertEquals(numbers[2].key,sortedNumbers[2].key);
		assertEquals(numbers[3].key,sortedNumbers[3].key);
		assertEquals(numbers[4].key,sortedNumbers[4].key);
		assertEquals(numbers[5].key,sortedNumbers[5].key);
	}
	
	@Test
	//Node coverage
	public void BubbleSorttestforAscending() {
		
		Item[] numbers = new Item[6];
		Item[] sortedNumbers =  new Item[6];
		numbers[0]= new Item(1);
		numbers[1]= new Item(2);
		numbers[2]= new Item(3);
		numbers[3]= new Item(4);
		numbers[4]= new Item(5);
		numbers[5]= new Item(6);
		sortedNumbers[0]= new Item(1);
		sortedNumbers[1]= new Item(2);
		sortedNumbers[2]= new Item(3);
		sortedNumbers[3]= new Item(4);
		sortedNumbers[4]= new Item(5);
		sortedNumbers[5]= new Item(6);
		SortAlgos.bubbleSort(numbers);
		assertEquals(numbers[0].key,sortedNumbers[0].key);
		assertEquals(numbers[1].key,sortedNumbers[1].key);
		assertEquals(numbers[2].key,sortedNumbers[2].key);
		assertEquals(numbers[3].key,sortedNumbers[3].key);
		assertEquals(numbers[4].key,sortedNumbers[4].key);
		assertEquals(numbers[5].key,sortedNumbers[5].key);
	}
	
	@Test
	//Node coverage and edge coverage
	public void BubbleSorttestforSingleElement() {
		
		Item[] numbers = new Item[1];
		Item[] sortedNumbers =  new Item[1];
		numbers[0]= new Item(1);
		sortedNumbers[0]= new Item(1);
		SortAlgos.bubbleSort(numbers);
		assertEquals(numbers[0].key,sortedNumbers[0].key);
	}
	
	@Test
	//Node coverage and condition coverage
	public void BubbleSorttestforTwoElement() {
		
		Item[] numbers = new Item[2];
		Item[] sortedNumbers =  new Item[2];
		numbers[0]= new Item(37);
		numbers[1]= new Item(32);
		sortedNumbers[0]= new Item(32);
		sortedNumbers[1]= new Item(37);
		SortAlgos.bubbleSort(numbers);
		assertEquals(numbers[0].key,sortedNumbers[0].key);
		assertEquals(numbers[1].key,sortedNumbers[1].key);
	}
	
	@Test
	public void SelectionSorttest() {
		
		Item[] numbers = new Item[6];
		Item[] sortedNumbers =  new Item[6];
		numbers[0]= new Item(100);
		numbers[1]= new Item(90);
		numbers[2]= new Item(80);
		numbers[3]= new Item(70);
		numbers[4]= new Item(60);
		numbers[5]= new Item(50);
		sortedNumbers[0]= new Item(50);
		sortedNumbers[1]= new Item(60);
		sortedNumbers[2]= new Item(70);
		sortedNumbers[3]= new Item(80);
		sortedNumbers[4]= new Item(90);
		sortedNumbers[5]= new Item(100);
		SortAlgos.selectionSort(numbers);
		assertEquals(numbers[0].key,sortedNumbers[0].key);
		assertEquals(numbers[1].key,sortedNumbers[1].key);
		assertEquals(numbers[2].key,sortedNumbers[2].key);
		assertEquals(numbers[3].key,sortedNumbers[3].key);
		assertEquals(numbers[4].key,sortedNumbers[4].key);
		assertEquals(numbers[5].key,sortedNumbers[5].key);
	}

	@Test
public void InsertionSorttest() {
		
		Item[] numbers = new Item[6];
		Item[] sortedNumbers =  new Item[6];
		numbers[0]= new Item(100);
		numbers[1]= new Item(90);
		numbers[2]= new Item(80);
		numbers[3]= new Item(70);
		numbers[4]= new Item(60);
		numbers[5]= new Item(50);
		sortedNumbers[0]= new Item(50);
		sortedNumbers[1]= new Item(60);
		sortedNumbers[2]= new Item(70);
		sortedNumbers[3]= new Item(80);
		sortedNumbers[4]= new Item(90);
		sortedNumbers[5]= new Item(100);
		SortAlgos.insertionSort(numbers);
		assertEquals(numbers[0].key,sortedNumbers[0].key);
		assertEquals(numbers[1].key,sortedNumbers[1].key);
		assertEquals(numbers[2].key,sortedNumbers[2].key);
		assertEquals(numbers[3].key,sortedNumbers[3].key);
		assertEquals(numbers[4].key,sortedNumbers[4].key);
		assertEquals(numbers[5].key,sortedNumbers[5].key);
	}
	
	@Test
public void MergeSorttest() {
	
	Item[] numbers = new Item[6];
	Item[] sortedNumbers =  new Item[6];
	numbers[0]= new Item(100);
	numbers[1]= new Item(90);
	numbers[2]= new Item(80);
	numbers[3]= new Item(70);
	numbers[4]= new Item(60);
	numbers[5]= new Item(50);
	sortedNumbers[0]= new Item(50);
	sortedNumbers[1]= new Item(60);
	sortedNumbers[2]= new Item(70);
	sortedNumbers[3]= new Item(80);
	sortedNumbers[4]= new Item(90);
	sortedNumbers[5]= new Item(100);
	SortAlgos.mergeSort(numbers);
	assertEquals(numbers[0].key,sortedNumbers[0].key);
	assertEquals(numbers[1].key,sortedNumbers[1].key);
	assertEquals(numbers[2].key,sortedNumbers[2].key);
	assertEquals(numbers[3].key,sortedNumbers[3].key);
	assertEquals(numbers[4].key,sortedNumbers[4].key);
	assertEquals(numbers[5].key,sortedNumbers[5].key);
}

	@Test
public void QuickSorttest() {
	
	Item[] numbers = new Item[6];
	Item[] sortedNumbers =  new Item[6];
	numbers[0]= new Item(100);
	numbers[1]= new Item(90);
	numbers[2]= new Item(80);
	numbers[3]= new Item(70);
	numbers[4]= new Item(60);
	numbers[5]= new Item(50);
	sortedNumbers[0]= new Item(50);
	sortedNumbers[1]= new Item(60);
	sortedNumbers[2]= new Item(70);
	sortedNumbers[3]= new Item(80);
	sortedNumbers[4]= new Item(90);
	sortedNumbers[5]= new Item(100);
	SortAlgos.quickSort(numbers);
	assertEquals(numbers[0].key,sortedNumbers[0].key);
	assertEquals(numbers[1].key,sortedNumbers[1].key);
	assertEquals(numbers[2].key,sortedNumbers[2].key);
	assertEquals(numbers[3].key,sortedNumbers[3].key);
	assertEquals(numbers[4].key,sortedNumbers[4].key);
	assertEquals(numbers[5].key,sortedNumbers[5].key);
}

	@Test
public void HeapSorttest() {
	
	Item[] numbers = new Item[6];
	Item[] sortedNumbers =  new Item[6];
	numbers[0]= new Item(100);
	numbers[1]= new Item(90);
	numbers[2]= new Item(80);
	numbers[3]= new Item(70);
	numbers[4]= new Item(60);
	numbers[5]= new Item(50);
	sortedNumbers[0]= new Item(50);
	sortedNumbers[1]= new Item(60);
	sortedNumbers[2]= new Item(70);
	sortedNumbers[3]= new Item(80);
	sortedNumbers[4]= new Item(90);
	sortedNumbers[5]= new Item(100);
	SortAlgos.heapSort(numbers);
	assertEquals(numbers[0].key,sortedNumbers[0].key);
	assertEquals(numbers[1].key,sortedNumbers[1].key);
	assertEquals(numbers[2].key,sortedNumbers[2].key);
	assertEquals(numbers[3].key,sortedNumbers[3].key);
	assertEquals(numbers[4].key,sortedNumbers[4].key);
	assertEquals(numbers[5].key,sortedNumbers[5].key);
}

}
