package latihan2;

public class User {
    public void turnOnComputer(Computer c){
        c.turnOnOff();
    }
    public void turnOffComputer(Computer c){
        c.turnOnOff();
    }
    public void writeTo(Computer c, int indexHDD, int writeSize){
        if(c.isPowerOn()){
            c.writeToHarddisk(indexHDD, writeSize);
        }else{
            System.out.println("KOMPUTER OFF");
        }
    }
}
