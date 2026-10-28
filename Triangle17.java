import java.util.Scanner;
public interface Triangle17 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("MASUKAN NILAI N = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            int j = 0;
            while (j<i){
                System.out.print("*");
                j++;
            }System.out.println();
            i++;
        }
        sc.close();
    }
}