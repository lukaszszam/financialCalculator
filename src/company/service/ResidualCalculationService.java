package company.service;

import company.model.InputData;
import company.model.MortgageResidual;
import company.model.Rate;
import company.model.RateAmounts;

public interface ResidualCalculationService {
    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);

}
