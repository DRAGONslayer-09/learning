package learnCode.practiceOOPS.Animal;

public class Dog {
    private String dogName;
    private String Breed;

    public Dog(String dgN, String dgB ){
        this.dogName = dgN;
        this.Breed = dgB;
    }

    public String getBreed() {
        return Breed;
    }

    public String getDogName() {
        return dogName;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
}
