package Patterns.Builder;

import java.math.BigDecimal;

public class AccountBuilder {
    //account fields with default values
    Integer id = 1;
    String name = "Default";
    String type = "prime";
    BigDecimal balance = new BigDecimal(0);
    String openDate = "no open date";
    String status = "inactive";

    public AccountBuilder() {
    }

    public AccountBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public AccountBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AccountBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public AccountBuilder withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder withOpenDate(String openDate) {
        this.openDate = openDate;
        return this;
    }

    public AccountBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public Account build() {
        return new Account(id, name, type, balance, openDate, status);
    }
}
