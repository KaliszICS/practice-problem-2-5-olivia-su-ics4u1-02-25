public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void insertionSort(char[] characters){
		int n = characters.length;

		for (int i = 0; i < n; i++){
			char key = characters[i];
			int index = i - 1;
			while (index >= 0 && characters[index] > key){
				characters[index + 1] = characters[index];
				index -= 1;
			}
			characters[index + 1] = key;
		}
	}

}
