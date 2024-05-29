package oop.usu;

public class Main {

    public static void main(String[] args){

        int i,j,k;

        for (i = 1; i <= 5; i++)
        {
            for (j = 1; j <= 3; j++)
            {
                for (k = 1; k <= 4; k++)
                    System.out.print('*');
                System.out.println();
            } // end inner for
            System.out.println();
        } // end outer for

        for ( i = 1; i <= 10; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        for ( i = 1; i <= 10; i++)
        {
            for ( j = 10; j >= i; j--)
            {
                System.out.print('*');
            }
            System.out.println();

        }

        System.out.println();

        for ( i = 1; i <= 10; i++)
        {
            for (j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for ( k = 10; k >= i; k--)
            {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        for ( i = 1; i <= 10; i++)
        {
            for ( j = 10; j > i; j--)
            {
                System.out.print(" ");
            }
            for ( k = 1; k <= i; k++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
