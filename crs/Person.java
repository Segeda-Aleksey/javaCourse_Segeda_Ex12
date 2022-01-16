public class Person {

    String name;
    int age;
    int year;

    public Person(final String name, final int year) {
        this.name = name;
        this.year = year;
        this.age = 2021 - year;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                '}';
    }
}
