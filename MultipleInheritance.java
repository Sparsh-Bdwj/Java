
interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MultipleInheritance implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A from InterfaceA is implemented.");
    }

    public void methodB() {
        System.out.println("Method B from InterfaceB is implemented.");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.methodA();
        obj.methodB();
    }
}
