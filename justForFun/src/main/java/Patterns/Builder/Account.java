package Patterns.Builder;

import java.math.BigDecimal;

public final class Account {
    public Account(Integer id, String name, String type, BigDecimal balance, String openDate, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.openDate = openDate;
        this.status = status;
    }

    private final Integer id;
    private final String name;
    private final String type;
    private final BigDecimal balance;
    private final String openDate;
    private final String status;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                ", openDate='" + openDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }
}
