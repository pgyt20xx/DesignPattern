package Adapter_extends;

/**
 * @author yuich
 * アダプターパターンを使用する
 */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}

}
