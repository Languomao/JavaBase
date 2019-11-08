package lan.guomao.ThinkInJava;

/**
 * Created by Languomao on 2018/4/13.
 */
public class Vampire {
    public static void main(String[] args){
        search();
    }

    static int a(int i) {
        return i/1000;
    }
    static int b(int i) {
        return (i%1000)/100;
    }
    static int c(int i) {
        return ((i%1000)%100)/10;
    }
    static int d(int i) {
        return ((i%1000)%100)%10;
    }
    static int com(int i, int j) {
        return (i * 10) + j;
    }
    static void calculate(int i,int m,int n){
        if(m*n==i){
            System.out.println(i + " = " + m + " * " + n);
        }
    }

    static int numberCom(int j,int k){
        return j*10+k;
    }
    public static void search(){
        //int[] vampire = new int[100];
        for(int i = 1001;i<9999;i++){
            calculate(i,numberCom(a(i),b(i)),numberCom(c(i),d(i)));
            calculate(i,numberCom(a(i),b(i)),numberCom(d(i),c(i)));
            calculate(i,numberCom(a(i),c(i)),numberCom(b(i),d(i)));
            calculate(i,numberCom(a(i),c(i)),numberCom(d(i),b(i)));
            calculate(i,numberCom(a(i),d(i)),numberCom(b(i),c(i)));
            calculate(i,numberCom(a(i),d(i)),numberCom(c(i),b(i)));
            calculate(i,numberCom(b(i),a(i)),numberCom(c(i),d(i)));
            calculate(i,numberCom(b(i),a(i)),numberCom(d(i),c(i)));
            calculate(i,numberCom(b(i),c(i)),numberCom(d(i),a(i)));
            calculate(i,numberCom(b(i),d(i)),numberCom(c(i),a(i)));
            calculate(i,numberCom(c(i),a(i)),numberCom(d(i),b(i)));
            calculate(i,numberCom(c(i),a(i)),numberCom(d(i),a(i)));
        }
    }
}
