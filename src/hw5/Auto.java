package hw5;

public class Auto {
    FillStrategy fillStrategy;
    void fill(){
        fillStrategy.fill();
    }
    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {

        System.out.println("Тормозим!");
    }

}
