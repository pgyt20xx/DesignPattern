package Adapter_implements;

/**
 * @author yuich
 * すでに提供されている部品
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;

	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}

}
