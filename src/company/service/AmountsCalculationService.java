package company.service;

import company.model.InputData;
import company.model.Overpayment;
import company.model.Rate;
import company.model.RateAmounts;

public interface AmountsCalculationService {
    RateAmounts calculate(InputData inputData, Overpayment overpayment);

    RateAmounts calculate(InputData inputData, Rate previousRate);

    RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
