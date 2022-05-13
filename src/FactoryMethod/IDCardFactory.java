package FactoryMethod;

public class IDCardFactory extends Factory {

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました");
	}
}
