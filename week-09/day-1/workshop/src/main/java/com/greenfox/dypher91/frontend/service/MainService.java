package com.greenfox.dypher91.frontend.service;

import com.greenfox.dypher91.frontend.models.Doubling;

public interface MainService {

    void createLog(String endpoint, Object object);

    Doubling doubleTheInput(int input);
//
//    Result sumTheUntil(Until until);
//
//    Result factorTheUntil(Until until);

}
