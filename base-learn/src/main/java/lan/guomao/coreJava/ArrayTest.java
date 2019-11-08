package lan.guomao.coreJava;

/**
 * Created by Languomao on 2018/4/13.
 */
public class ArrayTest {
    public static void main(String[] args){
        int[][] a = new int[5][10];
        for(int i = 0;i<5;i++){
            for(int j=0;j<10;j++){
                int num = 1;
                for(int k = 1;k<j;k++){
                    num = num*(j-k+1)/k;
                    a[i][j] = num;
                }
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
