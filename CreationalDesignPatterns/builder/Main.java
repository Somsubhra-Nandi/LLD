class Main{
    public static void main(String[] args){
        BurgerMeal burgermeal = new BurgerMeal.BurgerBuilder("Old","Gold").withCheese(true).HasDrinks("Coca-Cola").build();
    }
}