package pl.zaklopotany.bookStore.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.zaklopotany.bookStore.domain.Book;
import pl.zaklopotany.bookStore.domain.Order;
import pl.zaklopotany.bookStore.service.DiscountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    DiscountService discountService;


    @RequestMapping(value = "/makeOrder", method = RequestMethod.POST)
    public void makeOrder(Map<Long, Integer> books) {

        //step to do
        // fetch books
        //check availability
        // calculate discounts
        //send response

        List<Book> book = new ArrayList<>();

        for (Map.Entry entry : books.entrySet()) {
            entry.getKey();
        }

        Order order = new Order();

        order.setBooks(book);

        DisconutService.validate(order);


        book


    }

}
