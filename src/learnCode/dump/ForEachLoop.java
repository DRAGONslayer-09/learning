package learnCode.dump;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] marks = {25, 65, 68, 46, 86, 78};
        for (int i = marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }
        for (int ele:marks) {
            System.out.println(ele);
        }

        }
    }
