package exercises;

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	@Override
	public String toString() {
		return "Cat name is " + name + " and she has" + lives + " lives";
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		Cat sillyCat = new Cat("Silly");
		sillyCat.meow();
		sillyCat.meow();
		sillyCat.meow();

		
		// 2. Get the Cat to print it's name
		// this can one way to print the cat name...
		sillyCat.printName();

		//this can be another way to print the name and additional info...
		System.out.println(sillyCat);

		// 3. Kill the Cat!

		sillyCat.kill();
		sillyCat.kill();
		sillyCat.kill();
		sillyCat.kill();
		sillyCat.kill();


	}
}



