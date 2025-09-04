
public class BakingMyBread {

    public static void main(String[] args) {

        Sourdough sourdough = new Sourdough();

        Pastry pastry = new Pastry();
        Baguette baguette = new Baguette();
        RyeBread rye = new RyeBread();
        Focaccia focaccia = new Focaccia();


        System.out.println("Sourdough");
        sourdough.showRecipe();
        sourdough.bake();
        sourdough.bake(); // second bake shows "already baked"

        System.out.println("\nPastry");
        pastry.showRecipe();
        pastry.bake();

        System.out.println("\nBaguette");
        baguette.showRecipe();
        baguette.bake();

        System.out.println("\nRye Bread");
        rye.showRecipe();
        rye.bake();

        System.out.println("\nFocaccia");
        focaccia.showRecipe();
        focaccia.bake();
    }
}
