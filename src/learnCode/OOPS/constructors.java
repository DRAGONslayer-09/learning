package learnCode.OOPS;

public class constructors {
    int modelYear;
    String modelName;

    public constructors(int Year, String Name) {
        modelYear = Year;
        modelName = Name;
    }

     public static void main(String[] args){
         constructors myCar = new constructors(1969,"Mustang");
         System.out.println(myCar.modelName + "\n" + myCar.modelYear);
        }
    }

