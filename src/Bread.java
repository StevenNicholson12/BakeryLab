
public class Bread {
    private String breadName;
    private String state;
    private String ingredients;
    private String recipe;

    public Bread(String breadName, String ingredients, String recipe) {
        this.breadName = breadName;
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.state = "not baked";
    }

    public String getBreadName() { return breadName; }
    public String getIngredients() { return ingredients; }   // core method
    public String getRecipe() { return recipe; }

    public void bake() {
        if ("baked".equals(state)) {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        } else {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        }
    }

    @Override
    public String toString() {
        return breadName + " [" + state + "]";
    }
}