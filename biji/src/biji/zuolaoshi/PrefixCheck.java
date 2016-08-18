package biji.zuolaoshi;

import java.util.HashMap;

public class PrefixCheck {

	public static class Tries {
		private HashMap<Character, Tries> children = new HashMap<Character, Tries>();;
		private boolean end = false;

		public boolean addAndCheck(char[] chs, int i) {
			if (end) {
				return true;
			}
			if (i == chs.length) {
				end = true;
				return !children.isEmpty();
			}
			if (!children.containsKey(chs[i])) {
				children.put(chs[i], new Tries());

			}
			return children.get(chs[i]).addAndCheck(chs, i + 1);
		}

	}

	public static boolean hasPrefix(String[] strs) {
		Tries tries = new Tries();
		for (String str : strs) {
			if (str == null || str.equals("")) {
				return true;
			}
			if (tries.addAndCheck(str.toCharArray(), 0)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String[] strs = { "abcd", "abc" };
		System.out.println(hasPrefix(strs));
	}

}
