package TemplateMethod;

public class StringDisplay extends AbstractDisplay {
	// 表示すべき文字列
	private String string;

	// 文字列の表示幅
	private int width;

	// コンストラクタ
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length();
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("*|*" + string + "*|*");
	}

	@Override
	public void close() {
		printLine();
	}

	// openとcloseから呼び出されて"+----+"という文字列を表示するメソッド
	private void printLine() {
		System.out.println("+");
		for (int i = 0; i < width; i++) {
			System.out.println("-");
		}
		System.out.println("+");
	}

}
