package com.laoshishuo;

public class Java001 {
	public static void main(String[] args) {
		String str1 = "hEllo";
		String str2 = "hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode() + " " + str2.hashCode());
		System.out.println(toLowerCase(str1));
	}
	//将大写字母全部转化为小写
	public static String toLowerCase(String str) {
		char[] chars = str.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] >= 'A' && (chars[i] <= 'Z')) {
				chars[i] += 32;
			}
		}
		return new String(chars);
	}
}
