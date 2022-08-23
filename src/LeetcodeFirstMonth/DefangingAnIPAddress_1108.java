package LeetcodeFirstMonth;

public class DefangingAnIPAddress_1108 {
    public static String defangIP(String IPAddress){

//        Runtime: 9 ms, faster than 8.59% of Java online submissions for Defanging an IP Address.
//        Memory Usage: 42.3 MB, less than 20.39% of Java online submissions for Defanging an IP Address.
        String defangedIPAddress = "";
        for (int i = 0; i < IPAddress.length(); i++) {
            if(IPAddress.charAt(i) == '.'){
                defangedIPAddress += "[.]";
                continue;
            }
            defangedIPAddress += IPAddress.charAt(i);
        }
        return defangedIPAddress;
    }

    public static void main(String[] args) {
        String IPAddress = "255.100.50.0";
        String defangedIPAddress = defangIP(IPAddress);
        System.out.println(defangedIPAddress);
    }
}
