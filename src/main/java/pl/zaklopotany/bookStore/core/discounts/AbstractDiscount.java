package pl.zaklopotany.bookStore.core.discounts;

public abstract class AbstractDiscount implements discounts {
    private boolean enabled;


    public boolean isEnabled(){
        return enabled;
    }

}
