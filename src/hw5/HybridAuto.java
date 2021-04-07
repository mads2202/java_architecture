package hw5;

public class HybridAuto extends Auto {
    public HybridAuto(){
        this.fillStrategy=new HybridFillStrategy();
    }
}
