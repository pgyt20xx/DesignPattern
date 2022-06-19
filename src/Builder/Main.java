package Builder;

public class Main {
	public static void main(String[] args) {
		
		String mode[] = {"text"};
		
		if (mode.length != 1) {
			usage();
			System.exit(0);
		}
		
		if (mode[0].equals("text")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getTextResult();
			System.out.println(result);
		} else if (mode[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			String filename = htmlBuilder.getHTMLResult();
			System.out.println("HTMLファイル" + filename + "が作成されました。");
		} else {
			usage();
			System.exit(0);
		}
	}

	public static void usage() {
		System.out.println("Usage: java Main text テキストで文書作成");
		System.out.println("Usage: java Main html HTMLで文書作成");
	}
}
