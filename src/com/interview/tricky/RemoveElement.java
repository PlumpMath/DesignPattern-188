package com.interview.tricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class RemoveElement {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5)); //asList backs with the array, as an array cannot remove a element, so a new copy is needed
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			if(i.equals(3)) {
				iter.remove();
			}
		}
		
		System.out.println(list);
	}
}
