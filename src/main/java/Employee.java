public class Employee {

    private int ID;
    private static int IDcounter;
    private String Fname;
    private String Ename;
    private int Age;

    public Employee(String Fname, String Ename, int age, double salary){
        IDcounter = IDcounter + 1;
        ID = IDcounter;
        this.Fname = Fname;
        this.Ename = Ename;
        this.Age = age;
    }

    public int getUniqueID() {
        return ID;
    }


    public String getFname() {
        return Fname;
    }

    public void setFname(String newFname) {
        Fname = newFname;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String newEname) {
        Ename = newEname;
    }

    public int getAge() {
        return Age;
    }
}
