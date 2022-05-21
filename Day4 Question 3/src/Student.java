import java.util.Scanner;

public class Student {
    int roll;
    String name;
    String address;
    String collageName;

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCollageName() {
        return collageName;
    }
    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public Student(){

    }

    public Student(int roll, String name, String address) {
        this.setRoll(roll);
        this.setName(name);
        this.setAddress(address);

    }

    public Student(int roll, String name, String address, String collageName) {
        this.setRoll(roll);
        this.setName(name);
        this.setAddress(address);
        this.setCollageName(collageName);
    }
    public static Student getStudent(boolean isFromNIT){
        Scanner sc = new Scanner(System.in);
        Student student;
        if(isFromNIT) {
            System.out.print("Enter Name: ");
            String name=sc.nextLine();

            System.out.print("Enter Roll: ");
            int roll=sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Address: ");
            String address=sc.nextLine();

            student = new Student(roll,name,address);
            student.setCollageName("NIT");
        }
        else {
            System.out.print("Enter Name: ");
            String name=sc.nextLine();

            System.out.print("Enter Roll: ");
            int roll=sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Address: ");
            String address=sc.nextLine();

            System.out.print("Enter Collage Name: ");
            String collageName=sc.nextLine();

            student= new Student(roll,name,address,collageName);
        }

        return student;
    }

    public static void main(String[] args) {

        System.out.println("By Calling getStudent(true)");

        Student s1 = getStudent(true);

        System.out.println("Name: "+s1.getName());
        System.out.println("Roll: "+s1.getRoll());
        System.out.println("Address: "+s1.getAddress());
        System.out.println("Collage Name: "+s1.getCollageName());

        System.out.println("\n***************************\n");

        System.out.println("By Calling getStudent(false)");

        Student s2 = getStudent(false);

        System.out.println("Name: "+s2.getName());
        System.out.println("Roll: "+s2.getRoll());
        System.out.println("Address: "+s2.getAddress());
        System.out.println("Collage Name: "+s2.getCollageName());
    }
}