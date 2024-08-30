package learnCode.trycatch;

public class trycathfinally {

    public Boolean validateAge(int age){
        Boolean flag = false;
        try {
            if(age > 0 ){
                flag = true;
            }/*else if(age/0 == 0){
                System.out.println("arthrmtic exceptiom");
            }*/
            else {
                throw new Exception("n Number");
            }
        }

        catch (ArithmeticException e){
            System.out.println("arthemtic");
            System.out.println();

        }catch (Exception e){
            System.out.println("got exception"+e.getMessage());
        }finally {
            System.out.println("finally");
            return flag;
        }
    }
}
