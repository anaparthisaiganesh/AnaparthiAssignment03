package covariant;

class Animal {
    public Animal regenerate() {
        System.out.println("An animal is reproducing.");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    public Dog regenerate() {
        System.out.println("A dog is reproducing.");
        return new Dog();
    }
}

public class Animial {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        Animal newAnimal = animal.regenerate();
        Animal newDog = dog.regenerate();

        System.out.println(newAnimal.getClass().getSimpleName()); 
        System.out.println(newDog.getClass().getSimpleName()); 
    }
}
