package company;

import company.model.InputData;
import company.model.MortgageResidual;
import company.model.RateType;
import company.service.*;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args ) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(360))
                .withRateType(RateType.DECREASING);

        PrintingService printingService = new PrintingServceImpl();
        RateCalculationService rateCalculationService = new RateCalculationServiceImpl(
                new TimePointServiceImpl(),
                new AmountsCalculationServiceImpl(),
                new OverpaymentCalculationServiceImpl(),
                new ResidualCalculationServiceImpl(),
                new ResidualCalculationServiceImpl(),
                new ReferenceCalculationServiceImpl()
        );
        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
                printingService,
                rateCalculationService,
                SummaryServiceFactory.create());
        mortgageCalculationService.calculate(inputData);
    }
}
