public class Horse extends Animal {
    private String eyeColor;
    public Horse(String food, String location, String eyeColor) {
        super(food, location);
        this.eyeColor = eyeColor;
    }

    @Override
    public void eat() {
        System.out.println("ur horse feed " + getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("bruh");
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}

