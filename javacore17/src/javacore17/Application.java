package javacore17;

import javacore17.Collection.BackwardCustom;
import javacore17.Collection.ForwardCustom;

public class Application {

	public static void main(String[] args) {

		Integer[] array = { 12, 38, 84, 1248, 6894, 4789, 1, 1894,333,7};

		Collection me = new Collection(array);

		//Local class 
		Iterator1 createLocalClass = me.createLocalClass();
		while(createLocalClass.HasNext()) {
			System.out.println(createLocalClass.next());
		}
		
		
		System.out.println();
		
		//Anonymous 
		
		Iterator1 createIterator = me.createIterator();
		while (createIterator.HasNext()) {
			System.out.println(createIterator.next());
		}
	
		
		
		System.out.println();
		
		//override first 
		
		ForwardCustom createForwardCustom = me.createForwardCustom();

		while (createForwardCustom.HasNext()) {
			System.out.println(createForwardCustom.next());
		}
		System.out.println();

		//override second
		
		BackwardCustom createBackwardCustom = me.createBackwardCustom();

		while (createBackwardCustom.HasNext()) {
			System.out.println(createBackwardCustom.next());
		}

		System.out.println();
		
		
	}

}
