package lessons.lesson5;

public class StringMethods {
    public static void main(String[] args) {
        lengthMethod();
        concatMrthod();
        trimMethod();
        endsWithMethod();
        caseMethod();
        equalsMethods();
        containsMethod();
        charAtMethod();
        toCharArrayMethod();
        indexOfMethod();
        subStringMethod();
        replaceMethod();


    }
    public static void replaceMethod() {
        String str = "My name is Ihor";
        String replacedStr = str.replace("Ihor", "Max");
        System.out.println(replacedStr);
    }
    public static void subStringMethod(){
        String str = "My name is Ihor";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 7));
    }
    public static void indexOfMethod() {
        String str = "My name is Ihor";
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf('M'));
        System.out.println(str.indexOf("sdwfds"));
        System.out.println(str.indexOf("Ihor"));

    }
    public static void toCharArrayMethod(){
        String str= "My name is Ihor";
        char[] result = str.toCharArray();

        for(Character r : result){
            System.out.print(r + " ");
        }
        System.out.println();

    }
    public static void charAtMethod(){
        String str = "My name is Ihor";
        char result = str.charAt(4);
        System.out.println(result);
    }
    public static void containsMethod(){
        String str= "My name is Ihor";
        String str2 = "Ihor";
        boolean resultOfContains = str.contains(str2);
        System.out.println(resultOfContains);

    }
    public static void equalsMethods(){
        String str = "My name is Ihor";
        String str2 = "My name is Ihor";
        boolean resultOfCompare = str.equals(str2);
        System.out.println(resultOfCompare);

    }
    public static void caseMethod(){
        String str = "My Name Is Ihor";
        String toUpper = str.toLowerCase();
        String toLower = str.toUpperCase();
        System.out.println(toUpper);
        System.out.println(toLower);
    }
    public static void endsWithMethod(){
        String str = "My name is Ihor";
        boolean ends1 = str.endsWith("Ihor");
        boolean ends2 = str.endsWith("Maks");
        System.out.println(ends1);
        System.out.println(ends2);

    }
    public static void trimMethod(){
        String str1= "  My name is Ihor  ";
        String str2 = "  My name is Ihor  ";
        System.out.println(str1.trim());
        System.out.println(str2);
    }
    public static void concatMrthod(){
        String text1 = "Hello";
        String text2 = " world";
        String result = text1 + text2;
        System.out.println(result);

    }
    public static void lengthMethod(){
        String name = "Ihor Ihor";
        System.out.println(name.length());
    }
}
