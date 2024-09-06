
package overloading;

public class student {
    int id;
    String name;
    student(int i, String n){
        id = i;
        n = name;
    }
    void display(){System.out.println(id+""+name);}
    public static void main(String[] args) {
        student e1 = new student(111,"Karan");
        student e2 = new student(222,"Aryan");
        e1.display();
        e2.display();
    }
}
