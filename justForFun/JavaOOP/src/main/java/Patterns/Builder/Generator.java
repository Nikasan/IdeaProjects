package Patterns.Builder;

import java.math.BigDecimal;

public class Generator {
    public static void main(String[] args) {
        Account account = new Account(2,"Veron","private", new BigDecimal(60000),"25.03.1990", "active");
        Account acc = new AccountBuilder()
                .withStatus("common")
                .withName("Veronika")
                .build();
        System.out.println(account);
        System.out.println(acc);
    }

}
