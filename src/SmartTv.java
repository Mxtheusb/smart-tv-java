public class SmartTv{
    boolean power = false;
    int volume = 0;
    int currentChannelIndex;
    String[] channels = {"BBC", "CNN", "MTV", "HBO", "ESPN", "DISNEY", "TNT", "TBS", "FOX", "ABC"};
    
    
    public void powerOn(){
        power = true;
        System.out.println("TV Ligando...");
    }

    public void powerOff(){
        power = false;
        System.out.println("TV Desligando...");
    }

    public void volumeUp(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void volumeDown(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void channelUp(){
        currentChannelIndex = (currentChannelIndex + 1) % channels.length;
        System.out.println("Canal atual: " + channels[currentChannelIndex]);
    }

    public void channelDown(){
        currentChannelIndex = (currentChannelIndex - 1 + channels.length) % channels.length;
        System.out.println("Canal atual: " + channels[currentChannelIndex]);
    }

    public String getCurrentChannel(){
        return channels[currentChannelIndex];
    }

}