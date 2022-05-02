package Adapter_implements;

/**
 * @author yuich
 * BnnerクラスのメソッドをPrintインターフェースに適用するクラス
 * すでに提供されている部品を委譲によって必要な形に適合する
 */
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
