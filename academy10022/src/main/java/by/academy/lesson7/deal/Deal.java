package by.academy.lesson7.deal;

public class Deal {
	User seller;
	User buyer;
	Product[] products;

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void deal() {
		double summ = 0;
		for (Product p : products) {
			summ += p.getProductPrice();
		}

		double buyerMoney = buyer.getMoney() - summ;
		buyer.setMoney(buyerMoney);
		
		double sellerMoney = seller.getMoney() + summ;
		seller.setMoney(sellerMoney);

	}
}
