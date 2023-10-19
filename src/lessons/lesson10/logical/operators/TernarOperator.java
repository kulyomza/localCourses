package lessons.lesson10.logical.operators;

public class TernarOperator {
    public static void main(String[] args) {
        ternarOperator("How are you?");
        simpleOperator("How are you");

    }
    public static void ternarOperator(String str){
        var lastChar = str.charAt(str.length() - 1);
        var result = lastChar == '?' ? "question" : "No questions";
        System.out.println(result);
    }
    public static void simpleOperator(String str){
        var lastChar = str.charAt(str.length() - 1);
        if(lastChar == '?'){
            System.out.println("question");
        }else{
            System.out.println("No question");
        }
    }
}
