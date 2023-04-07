public class Bike {
private boolean isOn;
    private int speed;

    public void toggleOn(boolean isOn){
        this.isOn = isOn;
    }
    public boolean isOn() {
        return isOn;
    }


    public int accelerate(int speed){
        if(isOn==true)this.speed =speed+1;
        else this.speed = 0;
        return speed;
    }
    public int deccelerate(int speed){
        if(isOn==true)this.speed =speed-1;
        else this.speed = 0;
        return speed;
    }

    public int getSpeed() {
        if (speed > 14 && speed < 44)

            return speed;
        return speed;
    }
}
