package company.service;

import company.model.InputData;
import company.model.MortgageReference;
import company.model.Rate;

public interface ReferenceCalculationService {

    MortgageReference calculate(InputData inputData);
}
