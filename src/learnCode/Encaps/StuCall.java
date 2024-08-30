package learnCode.Encaps;

public class StuCall {
    public static void main(String[] args) {
        student obj = new student();
        obj.setAge(22);
        obj.setName("Tani");
        obj.setNationality("Indian");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
