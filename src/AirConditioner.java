public class AirConditioner {
    private boolean isOn;
   private int temperature;

    public void toggleOn(boolean isOn){
        this.isOn = isOn;
    }
    public boolean isOn() {
        return isOn;
    }


    public void increase(int temperature) {
        if (isOn == true)this.temperature = temperature+1;
        else this.temperature = 0;
    }

    public void decrease(int temperature) {
        if(isOn==true)this.temperature =temperature-1;
        else this.temperature = 0;
    }


    public int getTemperature() {
        if(temperature >15&&temperature <31)
            return temperature;
        else return 0;
    }
}

