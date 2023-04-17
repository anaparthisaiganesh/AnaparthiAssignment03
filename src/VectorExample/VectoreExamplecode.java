package VectorExample;

import java.util.Vector;

class VectorExamplecode {
    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();

        animals.add("Horse");
        animals.add("cat");

        // Using index number
        animals.add(2, "cow");
        System.out.println("Vector: " + animals);

        Vector<String> animals1 = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(animals);
        System.out.println("New Vector: " + animals);
    }
}