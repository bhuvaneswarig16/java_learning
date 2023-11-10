public class NumOfDigits {
    public static void main(String[] args){
        int a = 7868767; int count=0;
        while (a!=0){
            a= a/10;
            count++;
        }
        System.out.println(count);
    }
    
}
