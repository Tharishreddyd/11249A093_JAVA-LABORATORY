class Student1 {
    int rollNo;
    String name;
    static String college = "SCSVMV college";

    Student1(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Tharish");
        Student1 s2 = new Student1(102, "Kiran");

        s1.display();
        s2.display();
    }
}