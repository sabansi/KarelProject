import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
import javafx.util.Pair;

public class rearrange extends ConsoleProgram {
	public void run() {
		String word = readLine();
		rearrange(word);
	}

	private void rearrange(String word) {
		ArrayList<Pair<Integer, String>> pair = new ArrayList<Pair<Integer, String>>();
		StringTokenizer tokenizer = new StringTokenizer(word, " ");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			pair.add(new Pair<>(token.length(), token));
		}
		
		for(int i = 0; i < pair.size() - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < pair.size(); j++) {
				if(pair.get(j).getKey() < pair.get(minIndex).getKey()) {
					minIndex = j;
				}
			}
			Pair<Integer, String> temp = pair.get(i);
	        pair.set(i, pair.get(minIndex));
	        pair.set(minIndex, temp);
		} 
 
	//	Collections.sort(pair, Comparator.comparing(Pair::getKey));
		for (Pair<Integer, String> curPair : pair) {
			print(curPair.getValue() + " ");
		}
	}

}
