package ex2.repositrory;

import ex2.entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum AccountRepositoryImpl implements AccountRepository {
    ACCOUNT_REPOSITORY;

    private List<Account> accountList;
    private int autoincreamentId = 0;

    AccountRepositoryImpl() {
        accountList = new ArrayList<>();
    }

    @Override
    public Account save(Account account) {

        findById(account.getId()).ifPresentOrElse(
            foundAccount -> foundAccount.update(account),
            () -> {
                account.setId(++autoincreamentId);
                accountList.add(account);
            }
        );

        return account;
    }

    @Override
    public Optional<Account> findById(int Id) {
        return accountList.stream().filter(account -> account.getId() == Id).findFirst();
    }

    @Override
    public Optional<Account> findByAccountNo(String accountNo) {
        return accountList.stream().filter(account -> account.getAccountNo().equals(accountNo)).findFirst();
    }

    @Override
    public List<Optional<Account>> findAll() {
        return accountList.stream().map(account -> Optional.of(account)).toList();
    }
}
