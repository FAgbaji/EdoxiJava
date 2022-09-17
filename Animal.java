abstract class Animal {
    public abstract void animalSound();

    public void walk() {
        System.out.println("step");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: meow");
    }
}

class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.walk();
    }
}
