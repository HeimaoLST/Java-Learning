// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        float res = 0;
        float temp = 1;
        for(int i=1;i<=10;i++){

            for(int j=1;j<=i;j++){

                temp*=j;

            }

            res+=temp;
            temp = 1;
        }
        System.out.println(res);
        }
    }
