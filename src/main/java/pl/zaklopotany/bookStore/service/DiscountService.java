package pl.zaklopotany.bookStore.service;

import org.springframework.stereotype.Component;
import pl.zaklopotany.bookStore.core.discounts.AbstractDiscount;
import pl.zaklopotany.bookStore.core.discounts.PublishedAfterDiscount;
import pl.zaklopotany.bookStore.core.discounts.TotalPriceGreaterDiscount;
import pl.zaklopotany.bookStore.domain.Book;
import pl.zaklopotany.bookStore.domain.Order;

import java.util.ArrayList;
import java.util.List;


@Component
public final class DiscountService {
    List<AbstractDiscount> individualDiscountsList= new ArrayList<>();
    List<AbstractDiscount> totalDicountList = new ArrayList<>();

    {
        individualDiscountsList.add(new PublishedAfterDiscount());
        totalDicountList.add(new TotalPriceGreaterDiscount());


    }


    public void validate(Order order) {

        for (AbstractDiscount abstractDiscount : individualDiscountsList) {
            abstractDiscount.validate(order);
        }

        for (AbstractDiscount abstractDiscount : totalDicountList) {
            abstractDiscount.validate(order);
        }


    }
}
