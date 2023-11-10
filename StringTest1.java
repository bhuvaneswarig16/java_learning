public class StringTest1 {
    public static void main(String[] args){
        String s1="Welcome";
        String s2=" Hi Bhuvana";
        System.out.println("Length of s1:"+s1.length());
        System.out.println("S1 and S2:"+s1.concat(s2));
        System.out.println("S2 is:" +s2);
        System.out.println("Trimmed S2:"+s2.trim());
        System.out.println("3rd Char of S1:"+s1.charAt(3));
        System.out.println("S1 Contians Wel:"+s1.contains("Wel"));
        System.out.println("S1 Contains wel:"+s1.contains("wel"));
        System.out.println("S1 equals Welcome:"+s1.equals("Welcome"));
        System.out.println("S1 equals welcome:"+s1.equals("welcome"));
        System.out.println("Equals Ignore Case:"+s1.equalsIgnoreCase("Welcome"));
        System.out.println("Equals Ignore Case:"+s1.equalsIgnoreCase("welcome"));
        System.out.println("o replaced by a----"+ s1.replace('o','a'));
        System.out.println("Bhuvana replaced by Kaavya:"+s2.replace("Bhuvana","Kaavya"));
        System.out.println(s1.substring(0,3));
        System.out.println(s1.substring(3,7));

    }
    
}
