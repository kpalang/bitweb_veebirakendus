package kaur;

public class Operation {
    private int num1;
    private int num2;
    private String op;
    private double result;

    public void setNum1(String value) {
        if (tryParseInt(value)) {
            num1 = Integer.parseInt(value);
        } else {
            num1 = 0;
        }
    }

    public void setNum2(String value) {
        if (tryParseInt(value)) {
            num2 = Integer.parseInt(value);
        } else {
            num2 = 0;
        }
    }

    public void setNum1(int value) {
         num1 = value;
    }

    public void setNum2(int value) {
        num2 = value;
    }

    public void setOp(String value) {
        op = value;
    }

    public void setResult(int value) {
        result = value;
    }
    public void setResult(double value) {
        result = value;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOp() {
        return op;
    }

    public double getResult() {
        return result;
    }
    public String getResultString() {
        return String.valueOf(result);
    }

    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
