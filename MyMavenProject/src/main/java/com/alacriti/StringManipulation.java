package com.alacriti;

class StringManipulation {
	public String stringReverse(String s) {
		String rev = "";
		char ch[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			ch[i] = s.charAt(i);
		for (int i = s.length() - 1; i >= 0; i--)
			rev += ch[i];
		return rev;
	}

	public int stringLength(String s) {
		int len = 0;
		try {
			while (true) {
				// traversing and counting
				s.charAt(len);
				len++;
			}
		} catch (Exception e) {
			// Out of bounds
		}
		return len;
	}

	public boolean isPalindrom(String str) {
		boolean flag = false;
		char ch[] = str.toCharArray();
		// check string is Palindrom or not
		int count = ch.length - 1;
		for (int i = 0; i < ch.length; i++, count--) {
			if (ch[i] != ch[count]) {
				flag = false;
			} else {
				if (i == count) {
					flag = true;
				}
			}
		}
		return flag;
	}

	public boolean equals(String s1, String s2) {
		boolean flag = false;
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			int a = s1.charAt(i);
			int b = s2.charAt(i);
			if (a < b) {
				flag = false;
			} else if (a > b) {
				flag = true;
			}
		}
		return flag;
	}

	public static String strcat(String str1, String str2) {
		// converting string into char array
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		int counter = charArray1.length + charArray2.length;
		// stores both char array
		char[] charContainer = new char[counter];
		// for storing charArray1 into charContainer
		int i = 0;
		for (; i < charArray1.length; i++) {
			charContainer[i] = charArray1[i];
		}
		// for storing charArray2 into charContainer
		for (int j = 0; i < counter; j++, i++) {
			charContainer[i] = charArray2[j];
		}
		// converting charContainer char array into string
		return new String(charContainer);
	}
}
