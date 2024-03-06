package AJPJAVA;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		System.out.println("collection frameworks of queue");
		Queue<Object>q1 = new LinkedList<Object>();//first in first out ..like a row queue
		q1.offer(10);
		q1.offer("java");
		q1.offer(30.6f);
		System.out.println(q1);
		System.out.println(q1.poll());
		
		
		System.out.println("collection framework  of linkedlist");
		LinkedList<Object>l1 = new LinkedList<Object>();//order is maintained 
		l1.add(55);
		l1.addFirst(76);
		l1.addLast(100);
		System.out.println(l1);
		
		Queue<Object> q2=new ArrayDeque<Object>();
		q2.add(10);
		q2.add(40);
		System.out.println(q2);

	}

}
