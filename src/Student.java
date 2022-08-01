import java.util.List;

public class Student {
    int rating;
    private String name;

    public Student(String name) {
        this.name = name;
    }


    public static double getAvgRating(List<Student> students) {
        double sum = 0;
        if (students.isEmpty()) {
            return 0;
        }
        for (Student student : students) {
            sum += student.getRating();
        }
        return sum / students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return student.rating <= rating; //student2.rating <= student1.rating
    }

    public void changeRating(int rating) {
        this.rating=rating;
    }

    public static void removeStudent(Student student) {
        // TODO remove student
    }

    @Override
    public String toString() {
        return "Student{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}
