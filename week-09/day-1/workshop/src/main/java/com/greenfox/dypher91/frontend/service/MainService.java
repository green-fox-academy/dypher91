package com.greenfox.dypher91.frontend.service;

import com.greenfox.dypher91.frontend.models.Result;
import com.greenfox.dypher91.frontend.models.Until;

public interface MainService {

    void createLog(String endpoint, Object object);

    Result sumTheUntil(Until until);

    Result factorTheUntil(Until until);

}
