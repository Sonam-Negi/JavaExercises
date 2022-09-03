package com.negi;

import java.util.List;
import java.util.ListIterator;

public class PasingObjectsToMethod {

	public static void main(String[] args) {
		String s = "Enemy is the best";
		Integer i = Integer.valueOf(5);
		ShadowingEx sh = new ShadowingEx();
		
		print(s, i, sh);

	}
	
	public static void print(String data, Integer i, ShadowingEx a) {
		System.out.println(data);
		System.out.println(i);
		a.main(null);
	}

	public void sendMail(String subject, String body, List<String> to) {
		ListIterator<String> listIterator = to.listIterator();
		
		while(listIterator.hasNext()) {
			String next = listIterator.next();
			System.out.println(next);
		}
		
		for (String toRecipant : to) {
			// logic to send mail
			System.out.println(toRecipant);
		}
		
		for(int i=0; i<to.size(); i++ ) {
			String data = to.get(i);
			System.out.println(data);
		}
		
		to.forEach(data -> System.out.println(data));
	}
	
}
