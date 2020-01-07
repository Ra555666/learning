package misc.University;

import java.util.List;

public enum Faculty {
    SCIENCE("Science"),
    RELIGIOUS("Religious"),
    ART("Art");

    private String facultyTitle;
    private List subjects;



    Faculty(String title){
        this.facultyTitle = title;
    }

    public String getFacultyTitle() {
        return facultyTitle;
    }

    public void setFacultyTitle(String facultyTitle) {
        this.facultyTitle = facultyTitle;
    }
}
