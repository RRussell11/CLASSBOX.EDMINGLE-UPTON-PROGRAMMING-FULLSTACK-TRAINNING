package streampckge;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Product{
	private String name;
	private double price;
	
	public Product(String name,double price) {
	  this.name= name;
	  this.price=price;
	  
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}

}
	
	public class StreamExample3 {
		public static void main(String[]args) {

		List<Product> products= new ArrayList<>();
		products.add(new Product("laptop",1200.00));
		products.add(new Product("SmartPhone",800.00));
		products.add(new Product("Tablet",1200.00));
		products.add(new Product("Headphones",150.00));
		products.add(new Product("Smartwatches",250.00));
		Map<String, List<Product>> groupedProducts= products.stream()
				
		                       .collect(Collectors.groupingBy(product->{
		        	
		        	if(product.getPrice() < 300) {
		        		return "Budget";
		        	}else if (product.getPrice() <1000) {
		        	    return "Mid-Range";
		        	}
		        	else {
		        		return "Premium";
		        	
		        	}
		        	}));
		        
		        groupedProducts.forEach((priceRange, productList)->{
		        System.out.println(priceRange +":");
		        productList.forEach(System.out::println);
		        
		        });	
	}
		

}
	
	
