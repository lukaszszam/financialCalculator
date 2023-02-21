package company.service;

import company.model.InputData;
import company.model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {

    Overpayment calculate(BigDecimal rateNumber, InputData inputData);

    Overpayment calucalate(BigDecimal rateNumber, InputData inputData);
}
