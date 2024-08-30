package learnCode.overriding;

public class Mirav implements Sawan{
    @Override
    public int weight() {
        return 10;
    }

    @Override
    public int height() {
        return 0;
    }

    public String head(){
        return "bald head";
    }
}
