package TemplateMethod;

public class CharDisplay extends AbstractDisplay {
	private char ch;

	// コンストラクタ
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		// 開始文字列として*<<*を表示する。
		System.out.println("*<<*");

	}

	@Override
	public void print() {
		// フィールドに保存しておいた文字を1回表示する。
	}

	@Override
	public void close() {
		// 終了文字列として*>>*を表示する。
	}
}