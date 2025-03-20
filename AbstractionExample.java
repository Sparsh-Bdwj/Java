abstract class Tanish {
    abstract void sayHello();
    void reply(String arg) {
        System.out.println("Hii, how are you?.."+ arg);
    }
}

class Sparsh extends Tanish {
    void sayHello() {
        System.out.println("Hello Tanish from sparsh");
    }
}

class Abhishek extends Tanish {
    void sayHello() {
        System.out.println("Hello Tanish from abhishek");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Tanish sparsh = new Sparsh();
        sparsh.sayHello();
        sparsh.reply("sparsh");

        System.out.println("------------------");

        Tanish abhishek = new Abhishek();
        abhishek.sayHello();
        abhishek.reply("abhishek");
    }
}
