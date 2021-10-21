package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWordsInStringUsingSet {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		System.out.println(split.length);
		
		Set<String> remDup = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			if (!remDup.add(split[i])) {
				System.out.println("Duplicate Word :" +split[i]);
			}
		}
		System.out.println("Displaying below the input String without duplicate words");
		System.out.println(remDup);
	}

}
