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
    public void addDevice(){

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
        Room Myroom=new Room();
    }
}
