import java.lang.module.ResolutionException;
import java.security.Provider;
import java.util.List;
import java.util.Scanner;

public class Controller {
    
    Scanner scr= new Scanner(System.in);

    private Service service;
    public Controller(Service service){
        this.service=service;
    }
    public List<CourseDTO> getCourse(int no) {
        
        List<CourseDTO> courses = service.getCourse(int no);
        CanGo cango = new CanGo();
        courses = cango.selectCouse(courses);
    }

    
}
