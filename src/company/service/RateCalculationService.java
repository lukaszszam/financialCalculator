package company.service;

import company.model.InputData;
import company.model.Rate;

import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate (final InputData inputData);
}
