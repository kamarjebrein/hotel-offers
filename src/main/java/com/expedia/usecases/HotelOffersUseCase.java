package com.expedia.usecases;

import com.expedia.dtos.FilterParameters;
import com.expedia.dtos.FilteringResult;

public interface HotelOffersUseCase {

    FilteringResult filterOffersAgainst(FilterParameters parameters);
}
