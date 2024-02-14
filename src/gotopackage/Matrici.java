package gotopackage;

public class Matrici 
{
    public static void main(String[] args) 
    {
        int numRighe = 2;
        int numCol = 3;
        int[][] matrice = new int[numRighe][numCol];
//              i  j
        matrice[0][0] = 5;
        matrice[0][1] = 13;
        matrice[0][2] = 2;
        matrice[1][0] = 19;
        matrice[1][1] = 8;
        matrice[1][2] = 6;

        int sum = 0;

        cicloRiga: for(int i=0;i<numRighe;i++)
        {

            //continue o break lavorera sul ciclo i
            for(int j=0;j<numCol;j++)
            {
                sum +=matrice[i][j];
                if(matrice[i][j]==13)
                    break cicloRiga;
                //continue o break lavorera sul ciclo j
            }

             //continue o break lavorera sul ciclo i
        }

        System.out.println(sum);
    }
}
