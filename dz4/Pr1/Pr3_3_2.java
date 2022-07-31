public class Pr3_3_2 {
    public static void main(String[] args) {
        String s = "0123456789";
        s = s.concat("4247");
        s =s.substring(10,14);
        System.out.println(s);

        String s1 = "012345678";
        String [] array = s1.split("4");
        s1 = array[0] + "44247" + array[1];
        String s2 = s1.replace("01234", "");
        String s3 = s2.replace("5678", "");
        System.out.println(s3);
    }
}
