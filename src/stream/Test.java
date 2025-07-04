package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Яблоко", 450, ProductType.FRUIT));
        products.add(new Product("Банан", 700, ProductType.FRUIT));
        products.add(new Product("Морковь", 300, ProductType.VEGETABLE));
        products.add(new Product("Помидор", 600, ProductType.VEGETABLE));
        products.add(new Product("Апельсин", 800, ProductType.FRUIT));
        products.add(new Product("Огурец", 400, ProductType.VEGETABLE));
        products.add(new Product("Виноград", 1200, ProductType.FRUIT));
        products.add(new Product("Картофель", 200, ProductType.VEGETABLE));
        products.add(new Product("Говядина", 4500, ProductType.MEAT));
        products.add(new Product("Курица", 2000, ProductType.MEAT));
        products.add(new Product("Свинина", 3000, ProductType.MEAT));
        products.add(new Product("Молоко", 500, ProductType.DAIRY));
        products.add(new Product("Сыр", 1500, ProductType.DAIRY));
        products.add(new Product("Йогурт", 800, ProductType.DAIRY));


        List<String> res1 = products.stream()
                .filter(product -> product.getType() == ProductType.FRUIT)
                .map(Product :: getName).toList();
        System.out.println(res1);

        List<Long> res2 = Collections.singletonList(products.stream()
                .filter(product -> product.getType() == ProductType.VEGETABLE)
                .count());
        System.out.println("количество овощей - " + res2);

        List<String> res3 = products.stream()
                .filter(product -> product.getPrice() > 1000 && product.getPrice() <= 2000)
                .map(Product::getName).toList();
        System.out.println(res3);

        List<Product> res4 = products.stream()
                .filter(product -> product.getPrice() < 1000 && product.getType() == ProductType.FRUIT)
                .map(product -> new Product(product.getName(), (int)(product.getPrice() * 1.2), product.getType()))
                .sorted(Comparator.comparingInt(Product::getPrice))
                .toList();
        res4.forEach(System.out::println);

        List<Product> res5 = products.stream()
                .filter(product -> product.getType() == ProductType.MEAT || product.getType() == ProductType.DAIRY)
                .map(product -> new Product(product.getName(), (int)(product.getPrice() * 0.9), product.getType()))
                .filter(product -> product.getPrice() > 2000)
                .sorted(Comparator.comparingInt(Product::getPrice).reversed())
                .toList();
        res5.forEach(product ->
                System.out.println("Продукт: " + product.getName() + ", Цена после скидки: " + product.getPrice())
        );

        int totalCost = res5.stream()
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println(totalCost);



    }
}
