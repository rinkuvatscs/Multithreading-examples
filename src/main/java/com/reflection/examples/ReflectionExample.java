package com.reflection.examples;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReflectionExample {

	public static void main(String[] args) {
		/*
		 * Field[] fields = A.class.getDeclaredFields();
		 * System.out.println(fields.length); for (Field field : fields) {
		 * System.out.println(field.getName());
		 * 
		 * }
		 */

		Object obj = A.class;

		ReflectionExample reflectionExample = new ReflectionExample();

		List<VariableNameDetail> demoList = reflectionExample
				.getVariableNameDetail(A.class);
		for (VariableNameDetail variableNameDetail : demoList) {
			System.out.println(variableNameDetail);
		}

	}

	List<VariableNameDetail> getVariableNameDetail(Class classname) {
		List<VariableNameDetail> variableNameDetails = null;
		VariableNameDetail variableNameDetail = null;
		List<String> variableNames = null;

		Field[] fields = classname.getDeclaredFields();
		if (fields != null && fields.length != 0) {
			variableNameDetails = new ArrayList<VariableNameDetail>();
			variableNames = new ArrayList<String>();
			for (Field field : fields) {
				variableNames.add(field.getName());
			}
			Collections.sort(variableNames, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});
			int i = 1;
			for (String variable : variableNames) {
				variableNameDetail = new VariableNameDetail(i, variable);

				variableNameDetails.add(variableNameDetail);

				i++;
			}

		}
		return variableNameDetails;
	}

}