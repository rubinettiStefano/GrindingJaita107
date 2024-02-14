package esercizi;

public class CalcoloExp {
    public static void main(String[] args) {
        

        //(LEVEL ^ 1.5) * 10
        int exp = 0;


        for(int i=1;i<=5;i++)
            exp+= Math.pow(i, 1.5)*10;

        System.out.println(exp);
    }
}
