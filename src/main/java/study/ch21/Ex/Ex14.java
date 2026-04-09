package study.ch21.Ex;

import lombok.Getter;

//`InsufficientStockException` 클래스를 작성하시오. (Exception 상속 → Checked)
//
//        - 필드: `String productName`, `int requested`, `int available`
//        - 메시지: "(상품명) 재고 부족: 요청=(requested), 재고=(available)"
//
//        ```java
//void order(String product, int qty) throws InsufficientStockException {
//    int stock = getStock(product);
//    if (qty > stock)
//        throw new InsufficientStockException(product, qty, stock);
//}
//```

@Getter
class InsufficientStockException extends Exception {
    private String productName;
    private int requested;
    private int available;


    public InsufficientStockException(String product, int qty, int stock) {
        super("(" + product + ") 재고 부족: 요청=(" + qty + "), 재고=(" + stock + ")");
        productName = product;
        requested = qty;
        available = stock;
    }
}

public class Ex14 {
    public static void order(String product, int qty) throws InsufficientStockException {
        int stock = 10;
        if (qty > stock)
            throw new InsufficientStockException(product, qty, stock);
    }

    public static void main(String[] args) {
        try {       //throws가 있으면 try가 있어야 함
            order("키보드", 11);
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getProductName());
            System.out.println(e.getRequested());
            System.out.println(e.getAvailable());
        }

    }

}
