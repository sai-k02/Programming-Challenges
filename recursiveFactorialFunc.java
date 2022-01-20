class recursiveFactorialFunc{
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(5*4*3*2*1);
    }

    private static int recursiveFactorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*recursiveFactorial(n-1);
        }
    }

} 