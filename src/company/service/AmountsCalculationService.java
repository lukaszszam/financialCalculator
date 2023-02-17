package company.service;

import company.model.InputData;
import company.model.Rate;
import company.model.RateAmounts;

public interface AmountsCalculationService {
    RateAmounts calculate(InputData inputData);

    RateAmounts calculate(InputData inputData, Rate previousRate);
}
