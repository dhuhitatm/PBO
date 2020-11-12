package latihan2;

public class HardDisk {
    public int size;
    public String name;
    public int rpm;
    public int remainingSize;
    
    public HardDisk(int size){
        this.size = size;
        this.remainingSize = size;
    }
    public HardDisk(int size, String name) {
        this.size = size;
        this.name = name;
    }
    public HardDisk(int size, String name, int rpm) {
        this.size = size;
        this.name = name;
        this.rpm = rpm;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public int getSize() {
        return this.size;
    }
    public String getName() {
        return name;
    }
    public int getRpm() {
        return rpm;
    }
    public int getRemainingSize() {
        return remainingSize;
    }    
    public void writeDisk(int size){
        this.remainingSize = this.remainingSize - size;
    }
    @Override
    public String toString() {
        return "HARDDISK{ " + "SIZE = " + size + ",NAME = " + name + ",RPM = " + rpm + ",REMANINGSIZE = " + remainingSize + '}';
    } 
}
