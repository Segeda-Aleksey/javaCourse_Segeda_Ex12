public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Akex", 1996);

        Converter<Person, Student> converter = x-> {
            if (x.getAge() > 17 && x.getAge() < 40) {
                return new Student(x.getName(), x.getAge());
            }
            else {
                try {
                    throw new NotConvertExeption("Возраст не подходит");
                }catch (NotConvertExeption e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        Student student1 = converter.convert(person1);

        System.out.println(student1);
    }
}

