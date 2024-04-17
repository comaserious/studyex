public class SectionDTO {

    private int start;
    private int end;
    private String day;
    private int code;


    public SectionDTO(){}

    public SectionDTO(int start, int end, String day, int code) {
        this.start = start;
        this.end = end;
        this.day = day;
        this.code = code;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "SectionDTO{" +
                "start=" + start +
                ", end=" + end +
                ", day='" + day + '\'' +
                ", code=" + code +
                '}';
    }
}
