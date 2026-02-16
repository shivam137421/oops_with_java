import java.util.Arrays;
public class exception_handeling {
    public static void main(String[] args) {
        int[] arr={89,232,54};
        try{
            System.out.println(arr[5]);
        }
        catch(Exception index){
            //do something to this exception catch
            System.out.println("there is an exception");
        }
        System.out.println("this part is executed normally");
    }
    
}
