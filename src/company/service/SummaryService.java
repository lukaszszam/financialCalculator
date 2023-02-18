package company.service;

import company.model.Rate;
import company.model.Summary;

import java.util.List;

public interface SummaryService {

    Summary calculate(List<Rate> rates);
}
