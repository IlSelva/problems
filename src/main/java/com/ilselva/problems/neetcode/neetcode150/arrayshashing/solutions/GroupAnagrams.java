package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

	//second solution,do not sort string but make array of frequency
	// time: O(m * n) m = number of strings, n = length of longest string
	public List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();

		for(String str : strs){
			int[] freq = new int[26];
			for(char c : str.toCharArray()){
				freq[c - 'a']++;
			}

			String key = Arrays.toString(freq);
			List<String> res = map.getOrDefault(key, new ArrayList<>());
			res.add(str);
			map.put(key, res);
		}
		return new ArrayList<>(map.values());
	}


	// first solution, sort each string and store in a hashmap.
	// time: O(m * nlogn) m = number of strings, n = length of longest string
	public List<List<String>> groupAnagrams_first(String[] strs) {

		List<List<String>> result = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();

		for(String str : strs){
			String sort = sortString(str);
			if(map.containsKey(sort)){
				result.get(map.get(sort)).add(str);
			} else {
				result.add(new ArrayList<>(Collections.singleton(str)));
				map.put(sort, result.size() - 1);
			}
		}
		return result;
	}


	private String sortString(String str){
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}