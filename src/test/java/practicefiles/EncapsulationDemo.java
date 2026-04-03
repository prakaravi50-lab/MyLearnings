package practicefiles;

public class EncapsulationDemo {

    private int accno;
    private String accname;
    private double accbal;

    public void setAccno(int accno)
    {
        this.accno=accno;
    }
    public int getAccno()
    {
        return (accno);
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public double getAccbal() {
        return accbal;
    }

    public void setAccbal(double accbal) {
        this.accbal = accbal;
    }
}
