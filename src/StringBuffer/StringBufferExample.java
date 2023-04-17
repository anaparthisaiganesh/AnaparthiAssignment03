package StringBuffer;
public class StringBufferExample {
    public static void main(String[] args)
    {
        StringBuffer stringb = new StringBuffer();
        stringb.append("Hello");
        stringb.append(" ");
        stringb.append("world");
        String information = stringb.toString();
        System.out.println(information);
    }
}