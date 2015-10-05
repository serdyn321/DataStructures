import static org.junit.Assert.*;
 
import org.junit.Test;
 
public class SortedArrayListTest {
 
    @Test
    public void testAdd() {
        SortedArrayList sal = new SortedArrayList();
        sal.add(55);
        sal.add(32);
        sal.add(3);
        sal.add(3);
        assertEquals(3, sal.get(0));
        assertEquals(3, sal.get(1));
        assertEquals(32, sal.get(2));
        assertEquals(55, sal.get(3));
        
    }
 
    @Test
    public void testRemove() {
        SortedArrayList sal = new SortedArrayList();
        sal.add(3);
        sal.remove(0);
        try {
            sal.get(0);
            fail("error not caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            // woo hoo!!
        }
        try {
            sal.remove(9);
            fail("error not caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            // woo hoo!!
        }
    }
 
    @Test
    public void testGet() {
        SortedArrayList sal = new SortedArrayList();
        sal.add(3);
        assertEquals(3,sal.get(0));
        sal.clear();
        try{
        	sal.get(5);
            sal.get(0);
            fail("getting a value that doesnt exist");
        }catch (ArrayIndexOutOfBoundsException e){
            //who hoo
        }
    }
 
    @Test
    public void testSize() {
        SortedArrayList sal = new SortedArrayList();
        sal.add(3);
        sal.add(4);
        sal.add(5);
        assertEquals(3, sal.size());
    }
 
    @Test
    public void testContains() {
        SortedArrayList sal = new SortedArrayList();
        sal.add(3);
        sal.add(32);
        sal.add(55);
        assertEquals(false,sal.contains(25));
        assertEquals(true, sal.contains(55));
    }
 
    @Test
    public void testClear() {
        SortedArrayList sal = new SortedArrayList();
        sal.add(3);
        sal.add(32);
        sal.add(55);
        sal.clear();
        assertEquals(0,sal.size());
        try{
            sal.get(0);
            fail("getting a value out of cleared list");
        }catch(ArrayIndexOutOfBoundsException e){
            //who hoo
        }
    }
     
}