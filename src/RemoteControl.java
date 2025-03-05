public class RemoteControl {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.powerOn();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.volumeDown();
        smartTv.channelUp();
        smartTv.channelUp(); 
        smartTv.channelUp(); 
        smartTv.powerOff();
    }
}
