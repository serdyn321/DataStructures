import static org.junit.Assert.*;

import org.junit.Test;

public class WillSortedArrayListTest {

	@Test
	public void getExceptionTest() {
		SortedArrayList sar = new SortedArrayList();
		sar.add(1);
		sar.add(2);
		sar.add(3);
		sar.add(21);
		sar.add(5);
		sar.add(8);
		sar.add(1);
		sar.add(13);
		try{
			sar.get(-1);
			fail("Did not throw exception for get -1");
		}catch(Exception e){
			//Worked like it was supposed to
		}
		try{
			sar.get(8);
			fail("Did not throw exception for get 8");
		}catch(Exception e){
			//Worked like it was supposed to
		}
		try{
			sar.get(-1000000);
			fail("Did not throw exception for get -1000000");
		}catch(Exception e){
			//Worked like it was supposed to
		}
		try{
			sar.get(1000000);
			fail("Did not throw exception for get 1000000");
		}catch(Exception e){
			//Worked like it was supposed to
		}
	}
	
	@Test
	public void sortingTest() {
		SortedArrayList sar = new SortedArrayList();
		sar.add(1);
		sar.add(2);
		sar.add(3);
		sar.add(21);
		sar.add(5);
		sar.add(8);
		sar.add(1);
		sar.add(13);
		assertEquals(1, sar.get(0));
		assertEquals(1, sar.get(1));
		assertEquals(2, sar.get(2));
		assertEquals(3, sar.get(3));
		assertEquals(5, sar.get(4));
		assertEquals(8, sar.get(5));
		assertEquals(13, sar.get(6));
		assertEquals(21, sar.get(7));
	}
	
	@Test
	public void removeExceptionTest() {
		SortedArrayList sar = new SortedArrayList();
		sar.add(1);
		sar.add(2);
		sar.add(3);
		sar.add(21);
		sar.add(5);
		sar.add(8);
		sar.add(1);
		sar.add(13);
		try{
			sar.remove(-1);
			fail("Did not throw exception for remove -1");
		}catch(Exception e){
			//Worked like it was supposed to
		}
		try{
			sar.remove(8);
			fail("Did not throw exception for remove 8");
		}catch(Exception e){
			//Worked like it was supposed to
		}
		try{
			sar.remove(-1000000);
			fail("Did not throw exception for remove -1000000");
		}catch(Exception e){
			//Worked like it was supposed to
		}
		try{
			sar.remove(1000000);
			fail("Did not throw exception for remove 1000000");
		}catch(Exception e){
			//Worked like it was supposed to
		}
	}

	@Test
	public void removeBasicTest() {
		SortedArrayList sar = new SortedArrayList();
		sar.add(1);
		sar.add(1);
		sar.add(2);
		sar.add(3);
		sar.add(5);
		sar.add(8);
		sar.add(13);
		sar.add(21);
		sar.remove(4);
		assertEquals(3, sar.get(3));
		assertEquals(8, sar.get(4));
		assertEquals(13, sar.get(5));
		assertEquals(21, sar.get(6));
		try{
			sar.get(7);
			fail("Did not throw exception for get 7");
		}catch(Exception e){
			//Worked like it was supposed to
		}
	}
	
	@Test
	public void sizeAdjustTest() {
		SortedArrayList sar = new SortedArrayList();
		for(int bigLoop = 1;bigLoop<=3;bigLoop++){
			for(int loop = 0;loop<10;loop++){
				sar.add(loop);
			}
			assertEquals(10*bigLoop, sar.size());
			assertEquals(9, sar.get(10*bigLoop-1));
			try{
				sar.get(10*bigLoop);
				fail("Did not throw exception for get "+10*bigLoop);
			}catch(Exception e){
				//Worked like it was supposed to
			}
		}
	}
	
	@Test
	public void containsTest() {
		SortedArrayList sar = new SortedArrayList();
		sar.add(1);
		sar.add(1);
		sar.add(2);
		sar.add(3);
		sar.add(5);
		sar.add(8);
		sar.add(13);
		sar.add(21);
		assertEquals(true, sar.contains(1));
		assertEquals(true, sar.contains(2));
		assertEquals(true, sar.contains(3));
		assertEquals(true, sar.contains(5));
		assertEquals(true, sar.contains(8));
		assertEquals(true, sar.contains(13));
		assertEquals(true, sar.contains(21));
		assertEquals(false, sar.contains(0));
		assertEquals(false, sar.contains(4));
		assertEquals(false, sar.contains(-1));
		assertEquals(false, sar.contains(1000000));
		assertEquals(false, sar.contains(-1000000));
	}
	
	@Test
	public void clearTest() {
		SortedArrayList sar = new SortedArrayList();
		sar.add(1);
		sar.add(1);
		sar.add(2);
		sar.add(3);
		sar.add(5);
		sar.add(8);
		sar.add(13);
		sar.add(21);
		sar.clear();
		assertEquals(false, sar.contains(1));
		assertEquals(false, sar.contains(3));
		assertEquals(false, sar.contains(15));
		assertEquals(false, sar.contains(-1));
		assertEquals(false, sar.contains(1000000));
		assertEquals(false, sar.contains(-1000000));
		try{
			sar.remove(0);
			fail("Did not throw exception for remove 0");
		}catch(Exception e){
			//Worked like it was supposed to
		}
		try{
			sar.get(0);
			fail("Did not throw exception for get 0");
		}catch(Exception e){
			//Worked like it was supposed to
		}
	}
}