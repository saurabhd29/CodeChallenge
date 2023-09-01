package september;
/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

        A defanged IP address replaces every period "." with "[.]".


        Example 1:

        Input: address = "1.1.1.1"
        Output: "1[.]1[.]1[.]1"
        Example 2:

        Input: address = "255.100.50.0"
        Output: "255[.]100[.]50[.]0"
*/

public class CodeChallenge_0109 {

    private static void findDefanged(String ipaddress) {
        char[] ip = ipaddress.toCharArray();
        for(int i=0; i< ip.length;i++){
            if(ip[i] == '.'){
               System.out.print("[.]");
            }else {
                System.out.print(ip[i]);
            }
        }
        System.out.println("");
        for(char c : ip){
            if(c == '.'){
                System.out.print("[.]");
            }else {
                System.out.print(c);
            }
        }
    }
    public static void main(String[] args) {
        String ipaddress = "1.1.1.1";
//        System.out.println(ipaddress.replace(".","[.]"));

        findDefanged(ipaddress);
    }


}
