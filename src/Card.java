public class Card {
    public Card(int a) {
        this.a=a;
    }
    private int a;
    public int getNum() {
        return a;
    }

    public void setNum(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Num='" + a + '\'' +
                '}';
    }
}
