package day40_exeption.learn;

public class FourthTry {
    public static void main(String[] args) {

        try{

            System.out.println("Start");
            Thread.sleep(3000);
            System.out.println("Finish");

        }catch(Exception e){

            e.printStackTrace();
            System.out.println("_______________");
            System.out.println(e.getMessage());
        }


    }
}
