public class Pastry {

    private final Bread bread;

    public Pastry() {
        String ingredients =
                "2.00 cups of flour\n" +
                        "1 cups of water\n" +
                        "2 tsps of salt\n" +
                        "1.50 tsp of yeast\n" +
                        "1.50 cup of sourdough starter";
        String recipe =
                "Mix, make the dough, proof, fold, shape, rise, and bake at 375F for 45 minutes";
        this.bread = new Bread("Pastry", ingredients, recipe);
    }

    public String getIngredients() {
        return bread.getIngredients();
    }



    public void showRecipe() {
        System.out.println("Ingredients of " + bread.getBreadName() + " are:");
        System.out.println(getIngredients());
        System.out.println("\nRecipe of " + bread.getBreadName() + ":");
        System.out.println(bread.getRecipe());
    }


    public void bake() {
        bread.bake(); }

}
