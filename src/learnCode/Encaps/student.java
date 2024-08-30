package learnCode.Encaps;

public class student {
    private String name;
    private int age;
    private String nationality;

    public String getName(){
        return name;
    }
    public String getNationality(){
        return nationality;
    }
    public int getAge(){
        return age;
    }
    public void setName(String x){
        this.name = x;
    }
    public void setAge(int y){
        this.age = y;
    }
    public void setNationality(String z){
        this.nationality = z;
    }
}
