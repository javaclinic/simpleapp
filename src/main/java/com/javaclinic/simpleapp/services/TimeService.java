package com.javaclinic.simpleapp.services;

import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class TimeService {

    private static final Logger LOGGER = Logger.getLogger(TimeService.class.getCanonicalName());

    public TimeService() {
        LOGGER.finer("Instantiating TimeService instance.");
    }

    @PostConstruct
    public void init() {
        LOGGER.finer("Initializing TimeService instance.");
    }

    @PreDestroy
    public void finalize() {
        LOGGER.finer("Finalizing TimeService instance.");
    }

    public Date getTime() {
        LOGGER.finer("Servicing business request to TimeService instance.");
        return new Date();
    }

}
