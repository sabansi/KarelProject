import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class rearrange extends ConsoleProgram {
	public void run() {
		String word = readLine();
		rearrange(word);
	}

	private void rearrange(String word) {
		HashMap<Integer, String> map = new HashMap<>();
		StringTokenizer tokenizer = new StringTokenizer(word, " ");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			map.put(token.length(), token);
		}

		ArrayList<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
		Collections.sort(sortedKeys);
		for(Integer key : sortedKeys) {
			print(map.get(key) + " ");
		}
	}

}
