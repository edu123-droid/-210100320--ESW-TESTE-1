/**
 * @author Eduardo Ribeiro
 *
 * @number 210100320
 *
 * @date 08/06/2022
 *
 * @work Teste de Engenharia de Software
 *
 */


package pt.brunojesus.esg;

import pt.brunojesus.esg.operations.Operation;
import pt.brunojesus.esg.operations.impl.DivisionOperation;
import pt.brunojesus.esg.operations.impl.MultiplyOperation;
import pt.brunojesus.esg.operations.impl.SubtractOperation;
import pt.brunojesus.esg.operations.impl.SumOperation;

import java.util.Arrays;

public class CalculatorAPI {

    private final Operation sumOperation;
    private final Operation subtractOperation;
    private final Operation multiplyOperation;
    private final Operation divisionOperation;

    public CalculatorAPI() {
        sumOperation = new SumOperation();
        subtractOperation = new SubtractOperation();
        multiplyOperation = new MultiplyOperation();
        divisionOperation = new DivisionOperation();
    }

    /**
     *
     * @param operands make the operation that the user chose
     * sum - sum the values
     * sub - subtract the values
     * multiply - multiply the values
     * divide - divide the values
     * @return the value depending of the operation
     */

    public double sum(Double... operands) {
        return sumOperation.execute(Arrays.asList(operands));
    }

    public double sub(Double... operands) {
        return subtractOperation.execute(Arrays.asList(operands));
    }

    public double multiply(Double... operands) {
        return multiplyOperation.execute(Arrays.asList(operands));
    }

    public double divide(Double... operands) {
        return divisionOperation.execute(Arrays.asList(operands));
    }
}
