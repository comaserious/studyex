import java.util.List;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {


        Controller controller = new Controller();
        Scanner scr =new Scanner(System.in);
        do{
        System.out.println("강의 선택 : ");
        String command = scr.nextLine();

        if(command.equalsIgnoreCase("exit")){
            break;
        }
        List<CourseDTO> canCourse = controller.getCourse(Integer.parseInt(command));

        }while (true);
    }
}
