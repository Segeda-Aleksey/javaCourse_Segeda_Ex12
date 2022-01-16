public class Student {
    String name;
    int age;
    String groupe;


    public Student(final String name, final int age) {
        this.name = name;
        this.age = age;
        if(age < 26)
        this.groupe = "УбИН-01-22";
        else this.groupe = "УбИН-02-22";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupe='" + groupe + '\'' +
                '}';
    }
}
