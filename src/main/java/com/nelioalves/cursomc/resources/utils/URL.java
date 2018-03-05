package com.nelioalves.cursomc.resources.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {

	public static List<Integer> decodeInt(String s) {
		String[] vet = s.split(",");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < vet.length; i++) {
			list.add(Integer.parseInt(vet[i]));
		}

		return list;
		// return Outro jeito de fazer a mesma coisa, com apenas uma linha
		// Arrays.asList(s.split(",")).stream().map(x->Integer.parseInt(x)).collect((Collectors.toList()));
		// }
	}
}

