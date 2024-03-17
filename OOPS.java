public class OOPS {
    
    //Classes and objects
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Amit";
        System.out.print(p1.age+ " " +p1.name);

        p1.eat();
       String str1 =  p1.speak();
       System.out.println(str1);

       p1.walk(56);

    }
}


class Person {

    String name;
    int age;

    //MEHTODS
    void eat(){
        System.out.println("\n Eating");
    }

    String speak(){
        return "Speaking";
    }

    void walk(int steps){
        System.out.println(steps);
    }

}

