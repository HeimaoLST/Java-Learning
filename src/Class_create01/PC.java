public class PC {
    CPU cpu;
    HardDisk HD;


    public void setCpu(CPU temp) {
        cpu = temp;
    }
    public void setHD(HardDisk temp){
        HD = temp;
    }
    public void show(){
        System.out.println("cpu速度为"+this.cpu.getSpeed());
        System.out.println("硬盘容量为"+this.HD.getAmount());
    }
}
