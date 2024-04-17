public class CourseDTO {

    private String className;
    private SectionDTO sectionDTO;

    public CourseDTO(){}

    public CourseDTO(String className, SectionDTO sectionDTO) {
        this.className = className;
        this.sectionDTO = sectionDTO;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public SectionDTO getSectionDTO() {
        return sectionDTO;
    }

    public void setSectionDTO(SectionDTO sectionDTO) {
        this.sectionDTO = sectionDTO;
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "className='" + className + '\'' +
                ", sectionDTO=" + sectionDTO +
                '}';
    }
}
