public class PrintPatterns {

    public static void aPattern(int n) {
        /*
        # # # # # # # # # # #
          # # # # # # # # #
            # # # # # # #
              # # # # #
                # # #
                  #
        */

        for (int row = 0; row <= n / 2; row++) {
            for (int col = 0; col <= n; col++) {
                if(col<row || col>n-row){
                    System.out.print("  ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void bPattern(int n){
        /*
                  #
                # # #
              # # # # #
            # # # # # # #
          # # # # # # # # #
        # # # # # # # # # # #

        */
        for(int row=0;row<=n/2;row++){
           for(int col=n/2;col<=n+row;col++) {
               if(col<n-row){
                   System.out.print("  ");
               }
               else{
                   System.out.print("# ");
               }
           }
            System.out.println();
        }
    }

    public static void cPattern(int n){
        /*
              #
            # # #
          # # # # #
        # # # # # # #
          # # # # #
            # # #
              #
        */
        bPattern(n-1);
        aPattern(n);
    }

    public static void dPattern(int n){
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
         for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void ePattern(int n){
        /*
          1 2 3 4 5
            1 2 3 4
              1 2 3
                1 2
                  1
         */
        for(int row=0;row<=n;row++){
            for(int k=0; k<=row;k++){
                System.out.print("  ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }

    public static void fPattern(int n){
        /*
                1
              2 1
            3 2 1
          4 3 2 1
        5 4 3 2 1

         */
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for(int col=row;col>0;col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void gPattern(int n){
        /*
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1

         */
        for(int row=n;row>0;row--){
            for(int col=row;col>0;col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void hPattern(int n){
        /*
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1

         */
        for(int row=1;row<=n;row++) {
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for (int c1 = 1; c1 <= row; c1++) {
                System.out.print(c1 + " ");
            }
            if(row>1) {
                for (int c2 = row - 1; c2 > 0; c2--) {
                    System.out.print(c2 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void iPattern(int n){
        /*
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1
                1
         */
        for(int row=1;row<=n;row++){
            for(int space=n;space>n-row;space--){
                System.out.print("  ");
            }
            for(int c1=1;c1<=n-row+1;c1++){
                System.out.print(c1+" ");
            }
            for(int c2=n-row;c2>0;c2--){
                System.out.print(c2+" ");
            }
            System.out.println();
        }
    }

    public static void jPattern(int n){
        /*
        1               1
        1 2           2 1
        1 2 3       3 2 1
        1 2 3 4   4 3 2 1
        1 2 3 4 5 4 3 2 1

         */
        for(int row=1;row<=n-1;row++){
            for(int c1=1;c1<=row;c1++){
                System.out.print(c1+" ");
            }
            for(int space=1;space<=n*2;space++){
                if(space>row && space<2*n-row)
                System.out.print("  ");
            }
            for(int c2=row;c2>0;c2--){
                    System.out.print(c2 + " ");
            }
            System.out.println();
        }
        for(int lastrow=1;lastrow<=n;lastrow++){
            if(lastrow<=n) System.out.print(lastrow+" ");
            }
        for(int lastrow=n-1;lastrow>0;lastrow--){
           System.out.print(lastrow+" ");
        }
    }

    public static void kPattern(int n){
        /*
        1 2 3 4 5 4 3 2 1
        1 2 3 4   4 3 2 1
        1 2 3       3 2 1
        1 2           2 1
        1               1

         */
        for(int firstrow=1;firstrow<=n;firstrow++)
            System.out.print(firstrow+" ");
        for(int firstrow=n-1;firstrow>0;firstrow--)
            System.out.print(firstrow+" ");
        System.out.println();
        for(int row=1;row<=n;row++){
            for(int c1=1;c1<=n-row;c1++){
                System.out.print(c1+" ");
            }
            for(int space=1;space<2*n;space++){
                if(space>n-row && space<n+row){
                    System.out.print("  ");
                }
            }
            for(int c2=n-row;c2>0;c2--){
                System.out.print(c2+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args){
        bPattern(6);
        System.out.println();
        aPattern(6);
        System.out.println();
        cPattern(6);
        System.out.println();
        dPattern(6);
        System.out.println();
        ePattern(6);
        System.out.println();
        fPattern(6);
        System.out.println();
        gPattern(6);
        System.out.println();
        hPattern(9);
        iPattern(8);
        System.out.println();
        jPattern(8);
        System.out.println();
        kPattern(8);


    }
}
