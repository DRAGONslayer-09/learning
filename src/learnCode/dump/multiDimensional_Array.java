package learnCode.dump;

public class multiDimensional_Array {
        public static void main(String[]args){
                int [][] flats;
                flats = new int[3][3];

                flats [0][1] = 001;
                flats [0][2] = 002;
                flats [0][0] = 003;
                flats [1][0]= 101;
                flats [1][1]=102;
                flats [1][2] =103;
                flats [2][1] = 201;
                flats [2][2] = 202;

                for (int i=0; i< flats.length;i++){
                        for(int j=0;j< flats[i].length;j++) {
                                System.out.println(flats[i][j]);
                        }
        }

}
}
