package hw4;

public class CardReader implements USB {
    private MemoryCard memoryCard;
    public CardReader(MemoryCard mCard){
        this.memoryCard=mCard;
    }
    @Override
    public void connectWithUsbCable() {
        memoryCard.insert();
        memoryCard.copyData();
    }
}
