public class Employee {

    int ID;
    int IDcounter = 1001;

    public Employee(String Fname, String Ename, int age, double salary){
        ID = IDcounter;
        IDcounter++;
    }

    public int getUniqueID() {
        return ID;
    }


}
