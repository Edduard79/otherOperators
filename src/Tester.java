public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        int a = 15; //System.out.println(a);
            a += 5; //System.out.println(a);
            a -= 4; System.out.println("Final value of a is: " + a);

        int b = ++a; System.out.println("Value of b is: " + b);

            if(b % 2 == 0){
                System.out.println("B is even!");
            }else{
                System.out.println("B is odd!");
            }

            String expression = "b * ( b + 1 ) ";

            if((b * (b+1)) % 3 == 0){
                System.out.println("The result of expression " + expression +" is a multiple of 3!");
            }else{
                System.out.println("The result of expression " + expression + " is NOT a multiple of 3!");
            }

            boolean stat1 = b % 2 != 0;
            boolean stat2 = (b * (b+1)) % 3 == 0;

            System.out.println("Statement 1: " + stat1 +"\nStatement 2: " + stat2);

            System.out.println("Condition satisfied: " + (b % 2 != 0 && (b * (b+1)) % 3 == 0));


        }
}
