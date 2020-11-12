package latihan2;

public class Processor {
    public int nCore;
    public String name;
    
    public Processor(int nCore, String name){
        this.nCore = nCore;
        this.name = name;
    }
    public int getnCore() {
        return nCore;
    }
    public String getName() {
        return name;
    }   
    public String toString(){
        return "NAMA PROCESSOR : " + this.name + ",JUMLAH CORE : " + this.nCore;
    }
}
