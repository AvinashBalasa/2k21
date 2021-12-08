package hackerEvents.ford;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PriceCheck {

    public static void main(String[] args)
    {
       List<String> products = new ArrayList<>();
       products.add("egg");
       products.add("milk");
       products.add("cheese");
       List<String> productSold = new ArrayList<>();
       productSold.add("egg");
       productSold.add("egg");
       productSold.add("cheese");
       productSold.add("milk");
       List<Float> productPrices = new ArrayList<>();
       productPrices.add((float) 2.89);
       productPrices.add((float) 3.79);
       productPrices.add((float) 5.81);
       List<Float> soldPrice = new ArrayList<>();
       soldPrice.add((float) 2.89);
       soldPrice.add((float) 2.98);
       soldPrice.add((float) 5.81);
       soldPrice.add((float) 2.79);
        System.out.println("Mismatch items are :"+priceCheck(products,productPrices,productSold,soldPrice));

    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Write your code here
        int count =0;
        List<Product> origProductList = new ArrayList<>();
        IntStream.range(0, products.size()).forEach(i -> {
            Product orig = new Product();
            orig.label = products.get(i);
            orig.cost = productPrices.get(i);
            origProductList.add(orig);
        });
        //origProductList.forEach(System.out::println);

        List<Product> soldProductList = new ArrayList<>();
        IntStream.range(0, productSold.size()).forEach(i -> {
            Product sold = new Product();
            sold.label = productSold.get(i);
            sold.cost = soldPrice.get(i);
            soldProductList.add(sold);
        });
        //soldProductList.forEach(System.out::println);

        for(Product product : soldProductList)
            for (Product product1 : origProductList)
                if (product1.label.equals(product.label) &&
                        product1.cost != product.cost) count++;

        return count;
    }
    public static class Product{
        private String label;
        private float cost;

        public Product(String label, float cost) {
            this.label = label;
            this.cost = cost;
        }

        private Product() {

        }

        @Override
        public String toString() {
            return "Product{" +
                    "label='" + label + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
