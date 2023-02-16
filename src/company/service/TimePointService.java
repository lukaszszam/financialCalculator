package company.service;

import company.model.InputData;
import company.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {

    TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
