package com.company;

interface Executable{
    int execute(int a, int b);

}
interface StringExecutable{
    int execute(String a );

}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block...");
        int value = e.execute(12,13);
        System.out.println("Return value is " + value);
    }
/*
    public void run(StringExecutable e) {
        System.out.println("Executing code block...");
        int value = e.execute("Hello");
        System.out.println("Return value is " + value);
*/

    }

// () -> System.out.println("Hello there. ");

// runner.run(()-> {
//            return 8;
//        });

//        runner.run(()->8);
//(int a)->8);
/*
(int a)->
        {
            System.out.println("Hello there. ");
            return 7 +a ;
        });
 */

/*
 runner.run((a)->
        {
            System.out.println("Hello there. ");
            return 7 +a ;
        });
 */

/*
 runner.run (a ->
            {
                System.out.println("Hello there. ");
                return 7 + a;
            });
 */

    public class Main {

        public static void main(String[] args) {
            int c = 100;


            Runner runner = new Runner();
            runner.run(new Executable() {
                public int execute(int a, int b) {
                    System.out.println("Hello there. ");
                    return a+b+c;
                }
            });
            System.out.println("==================");

            runner.run ((a,b) ->
            {
                System.out.println("Hello there. ");
                return a+b+c;
            });
        }
    }


