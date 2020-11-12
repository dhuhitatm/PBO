package latihan2;

public class Computer {
    private boolean power = false;
    private HardDisk hd[] = new HardDisk[3];
    private Processor processor;
    private int nHd = 0;

    public Computer(String nameProcessor, int nCore) {
        this.processor = new Processor(nCore, nameProcessor);
        this.processor.name = nameProcessor;
        this.processor.nCore = nCore;
    }   
    public void addHardDisk(HardDisk hd){
        this.hd[nHd] = hd;
        nHd++;
    }  
    public void writeToHarddisk(int id, int size){
        this.hd[id].remainingSize = this.hd[id].remainingSize - size;
    }   
    public Processor getProcessor(){
        return this.processor;
    }   
    public int getTotalSizeHDD(){
        int total = 0;
        for (int i = 0; i < hd.length; i++) {
            total += hd[i].getSize();
        }
        return total;
    }
    
    public void turnOnOff(){
        if(this.power == false){
            this.power = true;
        }else{
            this.power = false;
        }
    }
    
    public boolean isPowerOn(){
        return this.power == true;
    }
    
    public void viewDetail(){
        if(this.power == true){
            this.viewDetailProcessor();
            System.out.println("");
            for (int i = 0; i < hd.length; i++) {
                System.out.println("HARDDISK " + (i+1) + " NAMA : " + this.hd[i].getName());
                System.out.println("HARDDISK " + (i+1) + " TOTAL SIZE : " + this.hd[i].getSize());
                System.out.println("HARDDISK " + (i+1) + " RPM SPEED : " + this.hd[i].getRpm());
                System.out.println("HARDDISK " + (i+1) + " REMAINING SIZE : " + this.hd[i].getRemainingSize());
                System.out.println(""
                        + " ");
            }
        }else{
            System.out.println("COMPUTER MATI");
        }
        
    }
    
    private void viewDetailProcessor(){
        System.out.println("Processor Name : " + this.processor.getName());
        System.out.println("Processor Core : " + this.processor.getnCore());
        
    }
}
