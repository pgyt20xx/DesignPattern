package FactoryMethod;

/**
 * @author yuich
 * 製品の作成(サブクラスのインスタンス生成)と製品の登録を行う
 * 具体的な実装はサブクラスに任せる
 */
public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);

}
