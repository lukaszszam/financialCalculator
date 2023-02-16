package company;

import company.model.InputData;
import company.model.MortgageResidual;
import company.service.*;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args ) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"));

        PrintingService printingService = new PrintingServceImpl();
        RateCalculationService rateCalculationService = new RateCalculationServiceImpl(
                new TimePointServiceImpl(),
                new AmountsCalculationServiceImpl(),
                new ResidualCalculationServiceImpl()
        );
        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
                printingService,
                rateCalculationService);
        mortgageCalculationService.calculate(inputData);
    }
}
