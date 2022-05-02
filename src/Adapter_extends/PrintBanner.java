package Adapter_extends;

/**
 * @author yuich
 * BnnerクラスのメソッドをPrintインターフェースに適用するクラス
 * すでに提供されている部品を継承によって必要な形に適合する
 */
public class PrintBanner extends Print {
	private Banner banner;
	
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
