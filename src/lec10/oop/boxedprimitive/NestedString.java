package lec10.oop.boxedprimitive;

import java.util.Date;
import org.apache.commons.lang.StringUtils;

public class NestedString {
    public static void main(String[] args) {
        String helloXML = "<html>" +
                "<head>" +
                "   <title>Hello World from Java</title>" +
                "<body>" +
                "Hello, today is: " + new Date() +
                "</body>" +
                "</html>";

        String title = StringUtils.substringBetween(helloXML, "<title>", "</title>");
        String content = StringUtils.substringBetween(helloXML, "<body>", "</body>");

        System.out.println("title = " + title);
        System.out.println("content = " + content);
    }
}