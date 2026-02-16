public class method {
    public static void print_sum(int a , int b){
        int sum=a+b;
        System.out.println(sum);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int factorial=n*factorial(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        print_sum(1,8);

        System.out.println(factorial(6));
        
    }
    
}
