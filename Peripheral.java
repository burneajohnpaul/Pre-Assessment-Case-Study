
class Peripheral {

    private int number;
    private String periname;
    private String ptype;
    private String empname;

    Peripheral(int number, String periname, String ptype, String empname) {
        this.number = number;
        this.periname = periname;
        this.ptype = ptype;
        this.empname = empname;

    }

    public int getNumber() {
        return number;
    }

    public String getEname() {
        return periname;
    }

    public String getPtype() {
        return ptype;
    }
    public String getEmpname(){
        return empname;
    }

    public String Show() {
        return "Peripheral Number: " + number + "\nPeripheral Name: " + periname + "\nPeripheral Type: " + ptype + "\nPeripheral Employee: " +empname;
    }
}
