public class Employee {

    private int ID;
    private static int IDcounter;
    private String Fname;
    public Employee(String Fname, String Ename, int age, double salary){
        IDcounter = IDcounter + 1;
        ID = IDcounter;
        this.Fname = Fname;
    }

    public int getUniqueID() {
        return ID;
    }


    public String getFname() {
        return Fname;
    }

    public void setFname(String newFname) {

    }
}
