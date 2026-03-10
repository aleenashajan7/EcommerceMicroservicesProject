import java.util.*;
import java.util.stream.*;

public class LambdaStreamService {

    public static void arithmeticDemo(){

        Arithmetic add=(a,b)->a+b;
        Arithmetic sub=(a,b)->a-b;
        Arithmetic mul=(a,b)->a*b;
        Arithmetic div=(a,b)->a/b;

        System.out.println(add.operate(5,3));
        System.out.println(sub.operate(5,3));
        System.out.println(mul.operate(5,3));
        System.out.println(div.operate(5,3));
    }

    public static void streamDemo(List<Product> products){

        List<Product> filtered =
                products.stream()
                .filter(p->p.getPrice()>300)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);

        long count = products.stream().count();

        System.out.println("Total products "+count);

        Optional<Product> max =
                products.stream()
                .max(Comparator.comparing(Product::getPrice));

        max.ifPresent(System.out::println);
    }

}

interface Arithmetic{
    double operate(double a,double b);
}