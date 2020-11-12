package latihan2;

public class Driver {
    public static void main(String[] args) {
        Computer c1 = new Computer("Intel Core i3 5150u", 2);
        Computer c2 = new Computer("Intel Core i5 5200u", 4);
        
        HardDisk h1 = new HardDisk(100);
        h1.setName("HARDDISK 1");
        h1.setRpm(5200);
        
        HardDisk h2 = new HardDisk(200);
        h2.setName("HARDDISK 2");
        h1.setRpm(5000);
        
        HardDisk h3 = new HardDisk(300, "HARDDISK 3", 5000);
        HardDisk h4 = new HardDisk(400, "HARDDISK 4");
        h4.setRpm(5300);
        HardDisk h5 = new HardDisk(500, "HARDDISK 5", 5000);
        
        c1.addHardDisk(h1);
        c1.addHardDisk(h2);
        c1.addHardDisk(h3);       
        c2.addHardDisk(h4);       
        User u1 = new User();        
        u1.writeTo(c1, 1, 100);        
        u1.turnOnComputer(c2);
        u1.writeTo(c2, 0, 100);
        u1.turnOnComputer(c1);
        u1.writeTo(c1, 0, 200);
        u1.writeTo(c1, 2, 200);
        u1.turnOffComputer(c2);
        
        c1.viewDetail();
        System.out.println(""
                + "");
        c2.viewDetail();
        
    }
}
