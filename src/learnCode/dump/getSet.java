package learnCode.dump;

class peeps{
    private String name;
    private int ID;

    public void setID(int n){
        ID = n;
    }
    public int getID(){
        return ID;
    }
    public void setName(String f){
        name = f;
    }
    public String getName(){
        return name;
    }

}
public class getSet {
    public static void main(String[]args){
        peeps Tan = new peeps();
        Tan.setID(25);
        Tan.setName("Tanishq");
        System.out.println(Tan.getName());
        System.out.println(Tan.getID());
    }
}
