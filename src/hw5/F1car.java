package hw5;

public class F1car extends Auto {
    public F1car(){
        this.fillStrategy = new F1PitstopStrategy();
    }

}
