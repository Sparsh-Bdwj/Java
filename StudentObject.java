public class StudentObject {
    int id;
    String name;
    public static void main(String[] args) {
        // creating a object in java
        StudentObject stu1 = new StudentObject();
        stu1.id = 55;
        stu1.name = "Danish Bhai";
        System.out.println("Hello roll no "+stu1.id+ " "+stu1.name);
        // creating a object with newInstance() method in java
        // or a modern way of creating object in java
        try {
            StudentObject stu2 = StudentObject.class.getDeclaredConstructor().newInstance();
            stu2.id = 9;
            stu2.name = "Mallu bhai";
            System.out.println("Hello roll no "+stu2.id+ " "+stu2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
