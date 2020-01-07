package misc.University;

import java.util.List;

public class Student {
    private String name;
    private String faculty;
    private List subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List getSubjects() {
        return subjects;
    }

    public void setSubjects(List subjects) {
        this.subjects = subjects;
    }
}
