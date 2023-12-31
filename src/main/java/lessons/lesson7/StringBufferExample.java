package lessons.lesson7;

import java.sql.Array;
import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        StringBuffer stringBuffer2 = new StringBuffer("Alex");

        stringBuffer2.append(Integer.valueOf(2));
        stringBuffer2.append(";");
        stringBuffer2.append(false);
        stringBuffer2.append('C');
        stringBuffer2.append(Arrays.asList(1, 2, 3));

        String str = "0123456789";
        StringBuffer stringBuffer1 = new StringBuffer(str);

        System.out.println(stringBuffer1.substring(3));
        System.out.println(stringBuffer1.substring(4, 8));
        System.out.println(stringBuffer1.replace(3, 5, "ABCDE"));

        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse();

        System.out.println(stringBuffer.delete(5, 9));
        System.out.println(stringBuffer.deleteCharAt(1));
        System.out.println(stringBuffer.insert(1, "ONE"));

    }
}
