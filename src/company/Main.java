package company;

import company.model.InputData;
import company.service.*;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args ) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(160));

        PrintingService printingService = new PrintingServceImpl();
        RateCalculationService rateCalculationService = new RateCalculationServiceImpl();
        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
                printingService,
                rateCalculationService);
        mortgageCalculationService.calculate(inputData);
    }
}
