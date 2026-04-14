package ex3.router;

import ex3.view.HomeView;
import ex3.view.View;
import lombok.Getter;

public enum Routes {
    HOME(new HomeView()), ACCOUNT(null), DEPOSIT(null), WITHDRAWAL(null);

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }
}
