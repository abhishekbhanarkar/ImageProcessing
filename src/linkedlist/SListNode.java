package linkedlist;

/* SListNode.java */

/**
 * SListNode is a class used internally by the SList class. An SList object is a
 * singly-linked list, and an SListNode is a node of a singly-linked list. Each
 * SListNode has two references: one to an object, and one to the next node in
 * the list.
 * 
 */

public class SListNode {
	public short red;
	public short green;
	public short blue;
	public Object runlength;
	public SListNode next;

	/**
	 * SListNode() (with two parameters) constructs a list node referencing the
	 * item "obj", whose next list node is to be "next".
	 */

	SListNode(short red, short green, short blue, Object runlength,
			SListNode next) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.runlength = runlength;
		this.next = next;
	}

	/**
	 * SListNode() (with one parameter) constructs a list node referencing the
	 * item "obj".
	 */

	SListNode(Object runlength) {
		this((short) 0, (short) 0, (short) 0, runlength, null);
	}
}
