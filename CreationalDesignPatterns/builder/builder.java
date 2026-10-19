import java.util.*;

class BurgerMeal{
    //must
    private final String bread;
    private final String patty;

    //optional
    private final boolean hasCheese;
    private final List<String> Toppings;
    private final String drinks;
    private final String side;

    //private constructor
    private BurgerMeal(BurgerBuilder builder){
        this.bread=builder.bread;
        this.patty=builder.patty;
        this.hasCheese=builder.hasCheese;
        this.Toppings=builder.Toppings;
        this.drinks=builder.drinks;
        this.side=builder.side;
    }

    //builder class
    public static class BurgerBuilder{
        //must
        private final String bread;
        private final String patty;

        //optional
        private boolean hasCheese;
        private List<String> Toppings;
        private String drinks;
        private String side;

        public BurgerBuilder(String bread, String patty){
            this.bread = bread;
            this.patty = patty;
        }

        public BurgerBuilder withCheese(boolean hasCheese){
            this.hasCheese=hasCheese;
            return this;
        }

        public BurgerBuilder HasToppings(List<String> Toppings){
            this.Toppings=Toppings;
            return this;
        }

        public BurgerBuilder HasDrinks(String drinks){
            this.drinks=drinks;
            return this;
        }

        public BurgerBuilder HasSide(String side){
            this.side=side;
            return this;
        }

        public BurgerMeal build(){
            if (bread == null || bread.isBlank() ||
                patty == null || patty.isBlank()) {
                throw new IllegalStateException(
                    "Bread and patty are required"
                );
            }
            return new BurgerMeal(this);
        }
    }
}