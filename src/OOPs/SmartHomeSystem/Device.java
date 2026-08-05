package OOPs.SmartHomeSystem;

interface Device {
    void turnOn();
    void turnOff();
    void getStatus();
}
class Fan implements Device{
    private boolean isOn=false;
    @Override
    public void turnOn(){
        isOn=true;
    }
    @Override
    public void turnOff(){
        isOn=false;
    }
    @Override
    public void getStatus(){
        if (isOn){
            System.out.println("Fan is turned on.\n");
        }else {
            System.out.println("Fan is turned off.\n");
        }
    }
}
class Light implements Device{
    private boolean isOn=false;
    @Override
    public void turnOn(){
        isOn=true;
    }
    @Override
    public void turnOff(){
        isOn=false;
    }
    @Override
    public void getStatus(){
        if (isOn){
            System.out.println("Light is turned on.\n");
        }else {
            System.out.println("Light is turned off.\n");
        }
    }
}
class AC implements Device{
    private boolean isOn=false;
    @Override
    public void turnOn(){
        isOn=true;
    }
    @Override
    public void turnOff(){
        isOn=false;
    }
    @Override
    public void getStatus(){
        if (isOn){
            System.out.println("AC is turned on.\n");
        }else {
            System.out.println("AC is turned off.\n");
        }
    }
}
class Room{
    Device[] devices;
    Room(int capacity){
        devices=new Device[capacity];
    }
    public void addDevice(Device device){
        for(int i=0; i<devices.length; i++){
            devices[0]=device;
        }
    }
    public void showStatus(){
        for (Device d : devices){
            d.getStatus();
        }
    }
    public void turnOffAll(){
        for (Device d : devices){
            d.turnOff();
        }
    }
}
class Main{
    public static void main(String[] args){
        Room r=new Room(1);
            r.addDevice(new Fan());
            r.devices[0].getStatus();
            r.devices[0].turnOn();
            r.showStatus();
            r.addDevice(new Light());
            r.showStatus();
    }
}
