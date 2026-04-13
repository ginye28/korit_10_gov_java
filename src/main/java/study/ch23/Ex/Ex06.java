package study.ch23.Ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

//다음 Product 클래스와 Map 리스트가 주어질 때,
//Stream을 사용하여 List<Product>로 변환하시오

public class Ex06 {
    public static void main(String[] args) {
        // List<Product>로 변환하시오
        @Data @AllArgsConstructor
        class Product {
            private int code;
            private String name;
            private int price;
        }

        List<Map<String, Object>> productMaps = List.of(
                Map.of("code", 1001, "name", "노트북", "price", 1200000),
                Map.of("code", 1002, "name", "마우스", "price", 35000),
                Map.of("code", 1003, "name", "키보드", "price", 55000)
        );

        //새리스트를 만들어서 기입
        List<Product> products = productMaps.stream()
                .map(m -> new Product(
                        (Integer) m.get("code"),
                        (String) m.get("name"),
                        (Integer) m.get("price")
                ))
                .toList();
        System.out.println(products);


    }
}


