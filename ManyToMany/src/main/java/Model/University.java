package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int universityId;

    private String name;

    @ManyToMany(mappedBy = "universities")
    private List<Student> students =new ArrayList<>();

    public University() {
    }

    public University(String name) {
        this.name = name;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityId=" + universityId +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
