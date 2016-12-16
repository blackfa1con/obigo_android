package com.obigo.obigoproject.service;

/**
 * Created by O BI HE ROCK on 2016-12-07
 * 김용준, 최현욱
 */

public enum ServiceManager {
    INSTANCE;
    private UserVehicleService userVehicleService;
    private UserRequestService userRequestService;
    private MessageService messageService;

    ServiceManager() {
        userVehicleService = RetrofitServiceGenericFactory.createService(UserVehicleService.class);
        userRequestService = RetrofitServiceGenericFactory.createService(UserRequestService.class);
        messageService = RetrofitServiceGenericFactory.createService(MessageService.class);
    }

    public UserVehicleService getUserVehicleService() {
        return userVehicleService;
    }

    public UserRequestService getUserRequestService() {
        return userRequestService;
    }

    public MessageService getMessageService() {
        return messageService;
    }

    public static ServiceManager getInstance() {
        return INSTANCE;
    }
}
