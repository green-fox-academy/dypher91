package Charsequence;

public class Shifter implements CharSequence {
    String field;
    int num;

    public Shifter(String field, int num){
        this.field=field;
        this.num=num;
    }

    @Override
    public int length() {
        return field.length();
    }

    @Override
    public char charAt(int index) {
        return field.charAt(index + num);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }


}
