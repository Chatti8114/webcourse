package java_0809;

import java.lang.Character.Subset;
import java.util.TreeSet;

public class TreeSet_2 {
	public static void main(String[] args) {

		TreeSet set = new TreeSet();

		String from = "b";
		String to = "d";
		

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		set.add("Flower");
		set.add("Canada");

		System.out.println(set);
		
		System.out.println("range search : from : " + from + " to : " + to);
		System.out.println("result11 : " + set.subSet(from, to));
		System.out.println("result22 : " + set.subSet(from, to + "zzzz"));

	}
}
