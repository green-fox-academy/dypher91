public class Counter {
    int value;
    int reset;

    public Counter() {
    }
    public  Counter(int value) {
        this.value = value;
        reset = value;
    }
    public void add(int number) {
        this.value += number;
    }
    public void add() {
        this.value += 1;
    }
    public int get() {
        return this.value;
    }
    public void reset() {
        value = reset;
    }
}