public class Dog extends Animal {
    private boolean isHavePriest;
    public Dog(String food, String location, boolean priestIsAlive) {
        super(food, location);
        isHavePriest = priestIsAlive;
    }

    @Override
    public void makeNoise() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println("U'r dog woofed");
    }
    public boolean isHavePriest() {
        return isHavePriest;
    }

    public void setHavePriest(boolean havePriest) {
        isHavePriest = havePriest;
    }
}

