package com.interview.producer_comsumer;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.PortableInterceptor.INACTIVE;

public class ProducerComsumerPattern {
	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();

		Thread producer = new Thread(new ProducerBQ(sharedQueue));
		Thread comsumer = new Thread(new ComsumerBQ(sharedQueue,  "comsumer1"));
		Thread comsumer2 = new Thread(new ComsumerBQ(sharedQueue, "comsumer2"));
		comsumer.start();
		comsumer2.start();
		producer.start();

	}
}

class ProducerBQ implements Runnable {
	private final BlockingQueue<Integer> queue;

	public ProducerBQ(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			try {
				System.out.println("Produced: " + i);
				queue.put(i);

			} catch (InterruptedException ex) {
				Logger.getLogger(ProducerBQ.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}

class ComsumerBQ implements Runnable {
	private final BlockingQueue<Integer> queue;
	private final String name;

	public ComsumerBQ(BlockingQueue<Integer> queue, String name) {
		this.queue = queue;
		this.name = name;
		HashMap map = new HashMap<>();
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Comsumer "+name+" comsumed: "  + queue.take());
			} catch (InterruptedException ex) {
				Logger.getLogger(ComsumerBQ.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}