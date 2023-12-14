import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {
	public void run() {

	}

	private boolean isMagicMatrix(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		boolean occ[] = null;
		if (n == m) {
			for (int i = 1; i <= n; i++) {
				{
					for (int j = 1; j <= n; j++) {
						occ[mat[i][j]] = true;
					}
				}
			}
			for (int i = 1; i <= n * n; i++) {
				if (occ[i] == false)
					return false;
			}
			return true;
		}
		return false;
	}
}
