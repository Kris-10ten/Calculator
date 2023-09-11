public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void performOperation(double operandOne, String operation, double operandTwo) {
        double result = 0.0;

        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        }

        System.out.println("Result: " + result);
    }

    public double getResults() {
        double result = 0.0;

        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        }

        return result;
    }
}

