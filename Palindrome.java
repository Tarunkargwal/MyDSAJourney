// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static void main(String[] args) {


        String ko ="wbklpwm";
        StringBuilder s1 = new StringBuilder(ko);
        String s6= s1.reverse().toString();
        System.out.println(s6);
        StringBuilder s2 = new StringBuilder(s6);
        String s3=s1.toString();
        System.out.println(s3);
        String s4= s2.toString();
        System.out.println(s4);
        System.out.println(s3.equals(s4));
        System.out.println(s2);
        System.out.println(s1.reverse());
        System.out.println(s1.equals(s2));

    }
}