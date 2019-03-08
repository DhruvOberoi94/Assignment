class Student {

    private String name;
    private String email;
    private Integer id;
    private Integer age;
    private String course;
    private Double percentage;


    public Student(StudentBuilder studentBuilder) {
        id = studentBuilder.getId();
        name = studentBuilder.getName();
        age = studentBuilder.getAge();
        course = studentBuilder.getCourse();
        email = studentBuilder.getEmail();
        percentage = studentBuilder.getPercentage();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", email=" + email +
                ", course=" + course +
                ", percentage=" + percentage +
                '}';
    }


}









class StudentBuilder {
    private String name;
    private Integer id;
    private Integer age;
    private String email;
    private String course;
    private  Double percentage;

    public StudentBuilder(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public StudentBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentBuilder withAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StudentBuilder withCourse(String course) {
        this.course = course;
        return this;
    }

    public Double getPercentage() {
        return percentage;
    }

    public StudentBuilder withPercentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}






public class Builder {
    public static void main(String[] args) {
        Student student = new StudentBuilder("DHRUV",100)
                .withAge(24)
                .withCourse("MCA")
                .withPercentage(95.0)
                .withEmail("dhruv.oberoi@tothenew.com")
                .build();

        System.out.println(student);
    }
}
