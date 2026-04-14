package ex2.repositrory;

import ex2.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Account save(Account account);
    Optional<Account> findById(int Id);
    Optional<Account> findByAccountNo(String accountNo);
    List<Optional<Account>> findAll();
}
