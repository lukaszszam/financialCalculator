package company.service;

import company.model.InputData;
import company.model.Rate;

import java.util.List;

public class MortgageCalculationServiceImpl implements MortgageCalculationService {

    private final PrintingService printingService;

    public MortgageCalculationServiceImpl(
            PrintingService printingService,
            RateCalculationService rateCalculationService) {
        this.printingService = printingService;
        this.rateCalculationService = rateCalculationService;
    }

    private final RateCalculationService rateCalculationService;


    @Override
    public void calculate(InputData inputData) {
        printingService.printInputDataInfo(inputData);
        List<Rate> rates = rateCalculationService.calculate(inputData);
    }
}
