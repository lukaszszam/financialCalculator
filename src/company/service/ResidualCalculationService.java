package company.service;

import company.model.*;

public interface ResidualCalculationService {
    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, Overpayment overpayment, Rate previousRate);

    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);
}
