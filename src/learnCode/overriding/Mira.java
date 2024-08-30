package learnCode.overriding;

public class Mira implements Sawan{
    @Override
    public int weight() {
        return 20;
    }

    @Override
    public int height() {
        return 0;
    }

    public String colour(String father){
        return father;
    }
    public String colour(String father,String mother){
        return mother;
    }
}
