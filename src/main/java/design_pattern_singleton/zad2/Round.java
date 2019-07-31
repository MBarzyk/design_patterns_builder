package design_pattern_singleton.zad2;

import java.util.Random;

public class Round {
    private int start, end;
    private char sign;

    public Round() {
        start = new Random().nextInt(MySettings.INSTANCE.getStartRange());
        end = new Random().nextInt(MySettings.INSTANCE.getEndRange());
        sign = MySettings.INSTANCE.getSigns().charAt(new Random().nextInt(MySettings.INSTANCE.getSigns().length()));
    }

    public boolean validate(int userResult) {
        boolean result = false;
        switch (sign) {
            case '+':
                result = (start + end) == userResult;
            break;
            case '-':
                result = (start - end) == userResult;
            break;
            case '*':
                result = (start * end) == userResult;
            break;
            case '/':
                result = (start / end) == userResult;
            break;
        }
        return result;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Round{" +
                "start=" + start +
                ", end=" + end +
                ", sign=" + sign +
                '}';
    }
}
