package day15_string;

 /*[SMS parts]
         Given a String in the following format:
         “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
        Separate these parts and print them separately: Sender: actualSender
        Number: actualNumber Message: actualMessage”
        */
public class SmsPart {
    public static void main(String[] args) {

        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        System.out.println(msg);

        int sendStart = msg.indexOf("<");
        int sendEnd = msg.indexOf(">")+1;

String name = msg.substring(sendStart, sendEnd);

int nameStart = msg.indexOf("[");
int nameEnd = msg.indexOf("]")+1;

String number = msg.substring(nameStart, nameEnd);

int msgStart = msg.indexOf("{")+1;
        int msgEnd = msg.indexOf("}");

        String message = msg.substring(msgStart, msgEnd);
        System.out.println(name);

        System.out.println(number);

        System.out.println(message);

    }
}
