package com.collections.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmapobj = new HashMap<Integer, String>();
		hashmapobj.put(528, "sravanthi");
		hashmapobj.put(234, "kranthi");
		hashmapobj.put(null, null);
		for (Map.Entry m : hashmapobj.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		TreeMap<Integer, String> treemapobj = new TreeMap<Integer, String>();
		treemapobj.put(528, "sravanthi");
		treemapobj.put(234, "kranthi");
	//	treemapobj.put(null, null);//nullpointer exception
		for (Map.Entry map : treemapobj.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}
}
