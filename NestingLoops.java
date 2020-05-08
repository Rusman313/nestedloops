public class NestingLoops {
   
        public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ )
        {
            for (char c='A'; c <= 'E'; c++  )//number changes faster than the letter 
            {
                System.out.println( c + " " + n );
            }
        }

        /*1.Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)?  the inner loop changes faster.


        2. if the order of the loops are changed it would reverse the order of the output and it would state :
        A1B1C1D1E1, A2B2C2D2E2, A3B3C3D3E3
        */

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.println( a + "-" + b + " " );
            }
            System.out.println();// * You will add a line of code here.
        }

        System.out.print("\n");

        /*3.Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().) - 
        
        it changed from a single line to multiple lines
        4.Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change? -
        
        it separated the code in to sections. 
        */

    }
    }
