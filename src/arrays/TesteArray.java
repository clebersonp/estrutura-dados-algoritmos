package arrays;

public class TesteArray {

	public static void main(String[] args) {

		Scores scores = new Scores();

		System.out.println(scores);
		
		// Add
		scores.add(new GameEntry("Rob", 10));
		scores.add(new GameEntry("Jill", 5));
		scores.add(new GameEntry("Make", 20));
		scores.add(new GameEntry("Jake", 10));
		scores.add(new GameEntry("Anna", 680));
		scores.add(new GameEntry("Rose", 700));
		scores.add(new GameEntry("Bob", 480));
		scores.add(new GameEntry("Rick", 550));
		scores.add(new GameEntry("Bill", 150));
		scores.add(new GameEntry("Rock", 701));
		scores.add(new GameEntry("Jill", 826));
		scores.add(new GameEntry("Jack", 2));

		System.out.println(scores);

		// Remove
		scores.remove(0);
//		scores.remove(10); // exception fora do range
		
		System.out.println(scores);
		
		System.out.println("====================================");
		
		char[] a = new char[] {'D', 'E', 'G', 'L', 'O', 'A', 'C', 'R', 'B', 'F', 'H', 'J', 'I', 'K', 'N', 'M', 'P', 'Q'};
		System.out.println(a);
		insertionSort(a);
		System.out.println(a);
	}
	
	// Insercao ordenada de um arry de chars em ordem ascendente
	public static void insertionSort(char[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			char cur = a[i];
			int j = i - 1;
			while((j >= 0) && (a[j] > cur)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = cur;
		}
	}

}
