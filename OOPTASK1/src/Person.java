public class Person {
    private int age;
    private String name ;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

      void introduce(){
        System.out.println("age :" + age);
        System.out.println("name :" + name);
    }
}
