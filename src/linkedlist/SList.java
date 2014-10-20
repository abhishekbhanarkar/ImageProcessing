package linkedlist;

/* SList.java */

/**
 * The SList class is a singly-linked implementation of the linked list
 * abstraction. SLists are mutable data structures, which can grow at either
 * end.
 * 
 **/

public class SList {

	private SListNode head;
	protected SListNode tail;
	public int size;

	/**
	 * SList() constructs an empty list.
	 **/

	public SList() {
		size = 0;
		tail = setHead(null);
	}

	/**
	 * isEmpty() indicates whether the list is empty.
	 * 
	 * @return true if the list is empty, false otherwise.
	 **/

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * length() returns the length of this list.
	 * 
	 * @return the length of this list.
	 **/

	public int length() {
		return size;
	}

	/**
	 * insertFront() inserts item "obj" at the beginning of this list.
	 * 
	 * @param runlength
	 *            the item to be inserted.
	 **/

	public void insertFront(int red, int green, int blue, Object runlength) {
		setHead(new SListNode((short) red, (short) green, (short) blue,
				runlength, getHead()));
		size++;
		if (size == 1) {
			tail = getHead();
		}
	}

	public void RemoveFront() {
		if (getHead() == null) {
			return;
		}
		if (size == 1) {
			setHead(tail = null);
			size = 0;
			return;
		}
		--size;
		setHead(getHead().next);
	}

	/**
	 * insertEnd() inserts item "obj" at the end of this list.
	 * 
	 * @param runlength
	 *            t,he item to be inserted.
	 **/
	public void insertEnd(int red, int green, int blue, Object runlength) {
		if (size == 0) {
			setHead(tail = new SListNode((short) red, (short) green,
					(short) blue, runlength, null));
		} else {
			tail.next = new SListNode((short) red, (short) green, (short) blue,
					runlength, null);
			tail = tail.next;
		}
		size++;
	}

	/**
	 * toString() converts the list to a String.
	 * 
	 * @return a String representation of the list.
	 **/

	public String toString() {
		Object obj;
		String result = "[ ";
		SListNode cur = getHead();
		while (cur != null) {
			obj = cur.red;
			result += "{";
			result = result + obj.toString() + ",";
			obj = cur.green;
			result = result + obj.toString() + ",";
			obj = cur.blue;
			result = result + obj.toString() + ",";
			obj = cur.runlength;
			result = result + obj.toString() + "} , ";
			cur = cur.next;
		}
		result = result + "]";
		return result;
	}

	public static void main(String[] args) {
		SList obj = new SList();
		short red, blue, green;
		int runlength;
		red = green = blue = 90;
		runlength = 1;
		obj.insertEnd(red, green, blue, runlength);
		System.out.println(obj.toString());
		red = green = blue = 12;
		obj.insertEnd(red, green, blue, runlength);
		System.out.println(obj.toString());
		red = green = blue = 45;
		obj.insertEnd(red, green, blue, runlength);
		System.out.println(obj.toString());
	}

	public SListNode getHead() {
		return head;
	}

	public SListNode setHead(SListNode head) {
		this.head = head;
		return head;
	}
}
