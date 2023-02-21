package company.service;

import company.model.InputData;
import company.model.MortgageReference;
import company.model.Rate;

public class ReferenceCalculationServiceImpl implements ReferenceCalculationService{


    @Override
    public MortgageReference calculate(InputData inputData) {
        return new MortgageReference(inputData.getAmount(), inputData.getMonthsDuration());
    }
}
