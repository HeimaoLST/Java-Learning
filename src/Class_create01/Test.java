public class Test {
    public static void main(String args[]){

        CPU cpu =new CPU();
        HardDisk disk= new HardDisk();
        PC pc= new PC();
        cpu.setSpeed(2200);
        disk.setAmount(200);
        pc.setCpu(cpu);
        pc.setHD(disk);
        pc.show();
    }
}
