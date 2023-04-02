package day24_office_hours;

public class MethodWithOthers {

    public static String dayOfWeek(int num) {
        if (num > 7 || num < 1) {
            return "Number is not in the range";
        }
        String[] words = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return words[num - 1];

    }

    public static String dayOfWeek2(int num) {
        String day = "";

        switch (num) {
            case 1:
                day = "Mon";
                break;
            case 2:
                day = "Tue";
                break;
            case 3:
                day = "Wed";
                break;
            case 4:
                day = "Thu";
                break;
            case 5:
                day = "fri";
                break;
            case 6:
                day = "Sat";
                break;
            case 7:
                day = "Sun";
                break;
            default:
                day = "Not in the range";
        }
        return day;
    }

    public static String dayOfWeek3(int num) {
        String day = "";

        switch (num) {
            case 1:
                return "Mon";
            default:
                return "Not in the range";
        }
    }

    public static void main(String[] args) {
        System.out.println(dayOfWeek(4));
        System.out.println(dayOfWeek2(6));
        System.out.println(dayOfWeek3(1));
    }
}


