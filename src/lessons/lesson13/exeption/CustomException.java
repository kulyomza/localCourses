package lessons.lesson13.exeption;

public class CustomException extends Exception{
    private int details;


    public CustomException(int details, String message){
        super((message));
        this.details = details;
    }
    public String toString(){
        return "CustomException{ " + details + " " + getMessage() + "}";

    }

}
