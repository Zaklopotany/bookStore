package pl.zaklopotany.bookStore.core.discounts;


/**
 * additional layer to support repeatable patterns
 */
public abstract class AbstractDiscount implements discounts {
    private boolean enabled;

    private double discount;

    public boolean isEnabled(){
        return enabled;
    }

}
