public class Arraytest2 {
    public static void main(String[] args){
        int a[][]={{10,20},{30,40},{50,60},{70,80}};
        //System.out.println(a.length);
        //System.out.println(a[0].length);
        /*for(int r=0;r<a.length; r++){
            for(int c=0; c<a[r].length; c++){
                System.out.println(a[r][c]);
            }
        }*/
        for(int i[]:a){
            for(int r:i){
                System.out.println(r);
            }
        }
    }
    
}
