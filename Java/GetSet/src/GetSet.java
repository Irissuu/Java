public class GetSet {

    private String vegetable;

    public void setVegetable(String favoritevegetable) {
        this.vegetable = favoritevegetable;
    }

    public String getVegetable(){
        return vegetable;
    }
    public void showVegetable(){
        System.out.println("Your favorite vegetable is: " + getVegetable());
    }
}
