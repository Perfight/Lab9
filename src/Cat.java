public class Cat extends Animal {
    private String furColor;
    public Cat(String food, String location, String furColor) {
        super(food, location);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println("meow, " + getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}

