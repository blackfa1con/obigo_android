package com.obigo.obigoproject.service;

/**
 * Created by O BI HE ROCK on 2016-12-07
 * 김용준, 최현욱
 * ServiceManager
 */

public enum ServiceManager {
    INSTANCE;
    // 차량 서비스
    private UserVehicleService userVehicleService;
    // 요청 서비스
    private UserRequestService userRequestService;
    // 메시지 서비스
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
