package study.ch23.Ex;

//문제 6의 결과에서 가격이 50000원 이상인 상품만 골라 List<Product>로 만드시오.


// 출력: [Product(code=1001, name=노트북, price=1200000),
//        Product(code=1003, name=키보드, price=55000)]

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.List;
//import java.util.Map;
//
//public class Ex07 {
//    public static void main(String[] args) {
//        @Data @AllArgsConstructor
//        class Product {
//            private int code;
//            private String name;
//            private int price;
//        }
//
//        List<Map<String, Object>> productMaps = List.of(
//                Map.of("code", 1001, "name", "노트북", "price", 1200000),
//                Map.of("code", 1002, "name", "마우스", "price", 35000),
//                Map.of("code", 1003, "name", "키보드", "price", 55000)
//        );
//
//        List<Product> products = productMaps.stream()
//                .map(m -> new Product(
//                        (Integer) m.get("code"),
//                        (String) m.get("name"),
//                        (Integer) m.get("price")
//                ))
//                .toList();
//        System.out.println(products);
//
//        List<Product> products1 =
//    }
//}
