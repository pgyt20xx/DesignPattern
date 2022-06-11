package AbstractFactory.factory;

public class Main {
	public static void main(String[] args) {
//		if(args.length != 2) {
//			System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
//			System.out.println("Example 1: java Main list.html listfactory.ListFactory");
//			System.out.println("Example 2: java Main div.html divfactory.DivFactory");
//			System.exit(0);
//		}
		
//		String filename = args[0];
//		String classname = args[1];
		
		String filename = "C:\\Users\\yuich\\Desktop\\test.txt";
//		String classname = "AbstractFactory.listfactory.ListFactory";
		String classname = "AbstractFactory.divfactory.DivFactory";
		
		Factory factory = Factory.getFactory(classname);
		
		// Blog
		Link blog1 = factory.createLink("Blog 1", "https://example.com/blog1");
		Link blog2 = factory.createLink("Blog 2", "https://example.com/blog2");
		Link blog3 = factory.createLink("Blog 3", "https://example.com/blog3");
		
		Tray blogTray = factory.createTray("Blog Site");
		blogTray.add(blog1);
		blogTray.add(blog2);
		blogTray.add(blog3);
		
		// News
		Link news1 = factory.createLink("News 1", "https://example/news1");
		Link news2 = factory.createLink("News 2", "https://example/news2");
		
		Tray newsTray = factory.createTray("News Site");
		newsTray.add(news1);
		newsTray.add(news2);
		
		// Page
		Page page = factory.createPage("Blog and News", "Yuichi");
		page.add(blogTray);
		page.add(newsTray);
		
		page.output(filename);
		
	}
}
