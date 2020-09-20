package javacore17practise;

public class PersonableApplication {

	public static void main(String[] args) {
		PersonFactory personFactory = new PersonFactory();

		Personable AnonymousOne = personFactory.createAnonymous();
		AnonymousOne.something();

		Personable createWifeLocal = personFactory.createWifeLocal();
		createWifeLocal.something();

		Personable player = PersonFactory.createPlayer();
		player.something();

		Personable sporMan = personFactory.createSportsMan();
		sporMan.something();
	}

}
