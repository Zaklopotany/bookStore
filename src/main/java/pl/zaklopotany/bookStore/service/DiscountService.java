package pl.zaklopotany.bookStore.service;

import org.springframework.stereotype.Component;
import pl.zaklopotany.bookStore.core.discounts.AbstractDiscount;
import pl.zaklopotany.bookStore.core.discounts.TotalPriceGreaterDiscount;
import pl.zaklopotany.bookStore.domain.Book;
import pl.zaklopotany.bookStore.domain.Order;

import java.util.ArrayList;
import java.util.List;


@Component
public class DiscountService {
    List<AbstractDiscount> discountsList = new ArrayList<>();

    {


        discountsList.add(new TotalPriceGreaterDiscount());




    }


    public void validate(Order order) {
        for(AbstractDiscount abstractDiscount : discountsList) {
            abstractDiscount.validate(order);
        }

    }
}
