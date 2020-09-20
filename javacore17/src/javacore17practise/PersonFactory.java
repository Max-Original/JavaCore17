package javacore17practise;

public class PersonFactory {

	// Inner class
	private class SportsMan implements Personable {

		@Override
		public void something() {
			System.out.println("doing sports");
		}
	}

	public SportsMan createSportsMan() {
		return new SportsMan();
	}

	// Local class

	public Personable createWifeLocal() {
		class Wife implements Personable {

			@Override
			public void something() {
				System.out.println("she is cleaning the house");
			}

		}
		return new Wife();
	}

	// Anonymous class

	public Personable createAnonymous() {
		return new Personable() {

			@Override
			public void something() {
				System.out.println("i do nothing");

			}

		};
	}

// static neasted
	private static class Player implements Personable {

		@Override
		public void something() {
			System.out.println("is plaing");

		}
	}
	public static Player createPlayer() {
		return new Player();
	}
	
}
