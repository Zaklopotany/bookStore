package pl.zaklopotany.bookStore.core.discounts;

import pl.zaklopotany.bookStore.domain.Order;

/**
 * additional layer to support repeatable patterns
 */
public class TotalDiscount extends AbstractDiscount {

    @Override
    public void validate(Order order) {

    }
}
