package arrays;

public class Scores {

	public static final int maxEntrie = 10;
	protected int numEntries;
	protected GameEntry[] entries;

	public Scores() {
		this.entries = new GameEntry[maxEntrie];
		this.numEntries = 0;
	}

	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < this.numEntries; i++) {
			if (i > 0) {
				s += ", ";
			}
			s += this.entries[i];
		}
		return s + "]";
	}

	// Adiciona GameEntry ordenando de forma descendente pelo score
	public void add(GameEntry e) {
		int newScore = e.getScore();
		// o novo registro 'e' corresponde mesmo a um dos maiores scores?
		if (this.numEntries == maxEntrie) { // array cheio
			if (newScore <= this.entries[this.numEntries - 1].getScore()) {
				return; // nesse caso, a nova Entrada, 'e', não é um dos maiores scores
			}
		} else { // o array não está cheio
			this.numEntries++;
		}
		int i = this.numEntries - 1;
		for (; (i >= 1) && (newScore > this.entries[i - 1].getScore()); i--) {
			this.entries[i] = this.entries[i - 1];
		}
		this.entries[i] = e;
	}

	// Remove um GameEntry pelo index e o retorna e reordena o array
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		if ((i < 0) || (i >= this.numEntries)) {
			throw new IndexOutOfBoundsException("Invalid index: " + i);
		}
		GameEntry temp = this.entries[i];

		for (int j = i; j < this.numEntries - 1; j++) {
			this.entries[j] = this.entries[j + 1];
		}

		this.entries[this.numEntries - 1] = null;
		this.numEntries--;
		return temp;
	}

}
