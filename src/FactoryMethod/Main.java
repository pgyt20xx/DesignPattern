package FactoryMethod;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Tom");
		Product card2 = factory.create("Mike");
		Product card3 = factory.create("Ted");
		
		card1.use();
		card2.use();
		card3.use();
	}
}
