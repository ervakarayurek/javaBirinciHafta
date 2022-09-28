package classesWithAttributes;

public class Product {
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
    	System.out.println("Yapıcı blok çalıştı.");
    	this.id= id;
    	this.renk = renk;
    	this.name = name;
    	this.price = price;
    	this.description = description;
    	this.stockAmount = stockAmount;
    }
	
    public Product() {
    	
    }
    
    //private yaptığımızda sadece tanımlandığı blokta yani Product bloğunda geçerli olur.
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
    
	//GETTER
	public int getId() {
		//int değerini döndürdüğü için public int.
		return id;
	}
    
	//SETTER
	public void setId(int id) {
		//set edilen değer parametre olarak verilmeli -int id-.
		this.id = id;
		//this.id'deki id bu classta bulunan product id. eşittir dediğimiz id parantez içindeki id.
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}

	
	
	//private int _id;
	//private String _name;
	//private String _description;
	//private double _price;
	//private int _stockAmount;
	//private String _renk;
	//private String _kod;
	
	//public void getid() {
		//return _id;
	//}
	
	 //public void setid(int id) {
		 //_id = id
	 //}
	//Yukarıdaki kullanımdan ziyade buradaki kullanım çok daha rahattır.
	
	
	
	
	
	
}
