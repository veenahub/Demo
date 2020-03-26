package PID1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {
 @Test
	public void test1() {
		LinkedList ll = new LinkedList();
		ll.add(4);
		int r =ll.get(0);
		assertEquals(4,r);
	}
}
