package com.interview.producer_comsumer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerComsumerPattern2 {
	public static void main(String[] args) {
		Vector<Integer> queue = new Vector<>();

		Thread producer = new Thread(new ProducerNo(queue));
		Thread comsumer = new Thread(new ComsumerNo(queue));
		new Thread(new ComsumerNo(queue)).start();
		comsumer.start();
		producer.start();
	}
}

class ProducerNo implements Runnable {
	int SIZE = 4;
	private final Vector<Integer> queue;

	public ProducerNo(Vector<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Produce " + i);
			try {
				produce(i);
			} catch (InterruptedException ex) {
				Logger.getLogger(ProducerNo.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		while (queue.size() == SIZE) {
			synchronized (queue) {
				System.out.println("The queue is full. ");
				queue.wait();
			}
		}
		synchronized (queue) {
			queue.add(i);
			queue.notifyAll();
		}
	}
}

class ComsumerNo implements Runnable {
	private Vector<Integer> queue;
	public ComsumerNo(Vector<Integer> queue ) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Comsume "+comsume());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private int comsume() throws InterruptedException {
		while(queue.isEmpty()) {
			synchronized (queue) {
				System.out.println("Queue is empty, waiting");
				queue.wait();
			}
		}
		synchronized (queue) {
			queue.notifyAll();
			return queue.remove(0);
		}
	}
	
}