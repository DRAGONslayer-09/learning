package learnCode.polymorphism;
class Animal{
    public void AnimalSound(){
        System.out.println("Animal sound is");

class pig extends Animal{

}
class dog extends Animal{

}
class cat extends Animal{

}}
}

public class poly {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        pig myPig = new pig();
        cat myCat = new cat();
        dog myDog = new dog();
        myAnimal.AnimalSound();
        myPig.animalsound();
        myCat.animalsound();
        myDog.animalsound();
    }
}
