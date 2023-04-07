package day26_methods;
// if you call class from the same package ---> do not need import
public class Painter {
    public static void main(String[] args) {

Picture.draw();
Picture.draw(25);
Picture.draw("black", "white");

int num = 6;
String str = "Test";
Picture.draw(str, num);


        }
    }


