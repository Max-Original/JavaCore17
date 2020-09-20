package javacore17;

import java.util.ArrayList;
import java.util.List;

public interface Iterator1 {

	public boolean HasNext();

	public Object next();
}

class Collection {
	private static Number[] array;

	public Collection(Number[] array) {
		super();
		Collection.array = array;
	}

	public class Forward implements Iterator1 {

		private int currentPosition = 0;

		@Override
		public boolean HasNext() {
			return currentPosition < array.length;
		}

		@Override
		public Object next() {
			return array[currentPosition++];
		};
	}

	public Forward createForward() {
		return new Forward();
	}

	public class Backward implements Iterator1 {

		int currentPosition = array.length - 1;

		@Override
		public boolean HasNext() {
			return currentPosition >= 0;
		}

		@Override
		public Object next() {
			return array[currentPosition--];
		}

	}

	public Backward createBackward() {
		return new Backward();
	}

	public class ForwardCustom extends Forward {

		private int currentPosition = 0;

		@Override
		public boolean HasNext() {
			return currentPosition < array.length;
		}

		@Override
		public Object next() {
			for (int i = 0; i < array.length; i++) {
				int number = (int) array[i];

				if (number % 2 == 0) {
					array[i] = 0;
				}

			}

			return array[currentPosition++];
		};

	}

	public ForwardCustom createForwardCustom() {
		return new ForwardCustom();
	}

	public class BackwardCustom extends Backward {
		int currentPosition = array.length - 1;

		@Override
		public boolean HasNext() {
			int lengthArray;
			if(array.length -1 % 2 == 0) {
				lengthArray = 0;
			}else {
				lengthArray = 1;
			}
			return currentPosition > lengthArray;
		}

		@Override
		public Object next() {
			currentPosition -= 2;
			return array[currentPosition];
		}
		
	}

		public BackwardCustom createBackwardCustom() {
			return new BackwardCustom();
		}
		
		// Anonymous class 
		
		public Iterator1 createIterator() {
			return new Iterator1() {
				
				int currentPosition = array.length-1;
				
				@Override
				public boolean HasNext() {
					int lengthArray;
					if(array.length % 2 == 0) {
						lengthArray = 1;
					}else {
						lengthArray = 2;
					}
					return currentPosition >=lengthArray;
				}
				
				
				@Override
				public Object next() {
					
					currentPosition -= 3;
					int verable = (int) array[currentPosition];
					
					if (verable % 2 == 0) {
						
					} else {
						currentPosition -= 3;
					}
					 
					return verable;
				}	
				
			};
		}
		
		
		//local class  
		
		public Iterator1 createLocalClass() {
			class Myclass implements Iterator1 {

				int currentPosition = 0;

				@Override
				public boolean HasNext() {
					int two = array.length -3;
					return currentPosition < two;
				}

				@Override
				public Object next() {
					currentPosition += 4;
					int verable = (int) array[currentPosition];

					if (verable % 2 == 0) {
						verable -= 100;
						array[currentPosition] = verable;
						System.out.println("число парне");
					} else {
						System.out.println("число не парне");
					}

					return verable;
				}

			}
			return new Myclass();
		}
}
