
package overloading;

public class Students {
    int id;
    String name;
    Students(){System.out.println("default constructor is invoked");}
    Students(int id, String name){
        this();
        this.id = id;
        this.name = name;
    }
    void display(){System.out.println(id+""+name);}
    public static void main(String[] args) {
        Students e1 = new Students(111, "Karan");
        Students e2 = new Students(222, "Aryan");
        e1.display();
        e2.display();
    }
}
