public class Television{
    private boolean isOn;
    private int volume;
    private int channel;

public boolean isOn(){
    return isOn;
}
    public void toggleOn() {
        if(isOn==true)isOn = false;
        else isOn=true;
    }

    //public boolean isOn() {if(isOn==true) isOn=false;
     //   else if(isOn==false)isOn=!true;
       // return isOn;
    //}

    public int increase() {
        if(isOn==true);
        if(volume>=0  && volume<=100) return volume++;
        return volume;

    }

    public int getvolume() {
        return volume;
    }

    public int decrease() {
        if(isOn==true);
        if(volume>=0 && volume <=100)return volume--;
        return volume;
    }

    public void changeChannel(int channel) {
        isOn=true;
        this.channel=channel;
        if(channel==1)System.out.println("NTA");
        if(channel==2)System.out.println("Channels tv");
        if(channel==3)System.out.println("African magic");

    }

    public int getchannel() {
        return channel;
    }
}
