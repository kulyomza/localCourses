package homeworks.hm7;

public class PracticeLesson {
    public static void main(String[] args) {
        //repeatStr(5,  " Max");
       // System.out.println(repeatStr(7,"Max"));

        //jadenSmith("Hello every body, how are you");
        makes10(1, 9);

    }
    public static String repeatStr( final int repeat, final String string){
        String str = "";

        for(int i = 0; i < repeat; i++){
            str = str.concat(string);
        }
        return str;
    }
    public static String jadenSmith(String phrase){


        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == ' '){

                phrase = phrase.replace(phrase.charAt(i+1), Character.toUpperCase(phrase.charAt(i+1)));
            }

        }
        System.out.println(phrase);
        return phrase;
    }
    public static boolean makes10(int a, int b){
        if((a + b) == 10){
            return true;
        }else{
            return false;
        }
    }
}
