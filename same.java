import java.util.HashMap;

import acm.program.ConsoleProgram;

public class same extends ConsoleProgram{
	public void run() {
		String s1 = readLine("Enter first string: ");
		String s2 = readLine("Enter second string: ");
		String s = s1 + s2;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for(char ch : map.keySet()) {
			if(map.get(ch) % 2 != 0) {
				println("false");
				break;
			}
		}
		println("true");
	}
}
