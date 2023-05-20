public class Main {
    public static void main(String[] args){
      Dog scooby = new Dog("meat", "House", false);
      Cat tom = new Cat("Fish", "Dacha","Black");
      Horse plotva = new Horse("Hay", "The Farm", "Grey");
      scooby.makeNoise();
      tom.eat();
      plotva.sleep();
      Vet doolittle = new Vet();
      doolittle.treatAnimal(scooby);
    }
}

