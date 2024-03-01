package idigital;

import java.util.ArrayList;
import java.util.HashMap;

public class example {

	public static void main(String[] args) {
		HashMap<Integer, ArrayList<String>> hashMap = new HashMap<Integer, ArrayList<String>>();

		ArrayList<String> list = new ArrayList<String>();

		list.add("java");

		list.add("java8");

		list.add("python");

		list.add("c++");

		hashMap.put(2, list);

		System.out.println(hashMap);

	}
	// TODO Auto-generated method stub

}
