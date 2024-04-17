import javax.management.MBeanRegistration;
import java.util.List;

public class CanGo {
    public List<CourseDTO> selectCouse(List<CourseDTO> courses) {
        int start;
        int end;
        List<CourseDTO> select=null;
        for(int i= 0;i<courses.size();i++){
            start = courses.get(i).getSectionDTO().getStart();
            end = courses.get(i).getSectionDTO().getEnd();

            if(start>=s && start<=e){

                continue;
            }
            else if(start<s && s<end){

                continue;
            }
            else if(courses.get(i).getSectionDTO().getDay().equals(courses.)){

                continue;
            }
            select= (List<CourseDTO>) courses.get(i);
        }

        return select;
    }
}
