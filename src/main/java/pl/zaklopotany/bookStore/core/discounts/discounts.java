package pl.zaklopotany.bookStore.core.discounts;

import pl.zaklopotany.bookStore.domain.Order;

public interface discounts {

    void validate(Order order);
}
