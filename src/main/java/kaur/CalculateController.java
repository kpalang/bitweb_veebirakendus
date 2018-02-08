package kaur;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateController {
    @GetMapping(path = "/calculate")
    public String getCalc(@RequestParam(value="num1", defaultValue="0") String num1,
                        @RequestParam(value="num2", defaultValue="0") String num2,
                        @RequestParam(value="op", defaultValue="sum") String op) {

        final Operation operation = new Operation();
        operation.setNum1(num1);
        operation.setNum2(num2);
        operation.setOp(op);

        switch (operation.getOp()) {
            case "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                break;
            case "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                break;
            case "prod":
                operation.setResult(operation.getNum1() * operation.getNum2());
                break;
            case "div":
                operation.setResult(operation.getNum1() / operation.getNum2());
                break;
        }

        return operation.getResultString();
    }

    @PostMapping(value = "/calculate", consumes = "application/json")
    @ResponseBody
    public Operation postCalc(@RequestBody Operation payload) {

        final Operation operation = new Operation();
        operation.setNum1(payload.getNum1());
        operation.setNum2(payload.getNum2());
        operation.setOp(payload.getOp());

        switch (operation.getOp()) {
            case "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                break;
            case "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                break;
            case "prod":
                operation.setResult(operation.getNum1() * operation.getNum2());
                break;
            case "div":
                operation.setResult(operation.getNum1() / operation.getNum2());
                break;
        }

        return operation;
    }

    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
