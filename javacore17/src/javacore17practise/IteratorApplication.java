package javacore17practise;

public class IteratorApplication {
	public static void main(String[] args) {

		Integer[] array = { 1, 2, 38, 145, 387, 4849, 1761, 64 };

		Collection myCollection = new Collection(array);

		Iterator forward = myCollection.createForward();

		while (forward.hasNext()) {
			System.out.println(forward.next());
		}

		System.out.println();

		Iterator backward = myCollection.createBackward();

		while (backward.hasNext()) {
			System.out.println(backward.next());
		}
	}
}
