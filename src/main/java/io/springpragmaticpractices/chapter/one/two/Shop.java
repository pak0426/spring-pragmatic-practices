package io.springpragmaticpractices.chapter.one.two;

public class Shop {
    public void sell(Account account, Product product) {
        long price = product.getPrice();
        if (account.canAfford(price)) {
            account.withdraw(price);
            System.out.println(product.getName() + "를 구매했습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
