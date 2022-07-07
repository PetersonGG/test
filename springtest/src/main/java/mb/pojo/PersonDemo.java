package mb.pojo;

public class PersonDemo {

    public void change1(int age){
        age=100;
    }
    public void change2(Person person){
        person.setName("xxxx");
    }
    public void change3(String str){
       str="xxx";
    }
    public static void main(String[] args) {
        PersonDemo personDemo = new PersonDemo();
        int age =122;
        personDemo.change1(10);
        System.out.println(age);

        Person person = new Person("abc");
        personDemo.change2(person);
        System.out.println(person.getName());


        String str="122";
        personDemo.change3(str);
        System.out.println(str);

    }
}
