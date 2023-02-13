package company;

import company.model.InputData;
import company.service.PrintingServceImpl;
import company.service.PrintingService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(160));


        PrintingService printingService = new PrintingServceImpl();
        printingService.printInputDataInfo(inputData);
    }
}
