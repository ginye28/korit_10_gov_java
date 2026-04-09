package study.ch21.Ex;

//쇼핑몰 시스템의 예외 계층을 설계하시오.
//
//```
//ShopException (최상위)
//├── PaymentException
//│   ├── InsufficientBalanceException
//│   └── CardExpiredException
//└── OrderException
//    └── OutOfStockException
//```

import lombok.NoArgsConstructor;

@NoArgsConstructor
class ShopException extends Exception {
    public ShopException(String message) {
        super(message);
    }
}

class PaymentException extends Exception {
    public PaymentException(String message) {
        super(message);
    }
}

class OrderException extends Exception {
    public OrderException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends PaymentException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class CardExpiredException extends PaymentException {
    public CardExpiredException(String message) {
        super(message);
    }
}

class OutOfStockException extends OrderException {
    public OutOfStockException(String message) {
        super(message);
    }
}

public class Ex16 {
    public static void main(String[] args) {
        try {
            throw new OutOfStockException("재고가 부족합니다.");
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
