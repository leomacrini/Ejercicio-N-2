package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("Ejecutando el constructor de Notification Service");
    }

    public String Saludar(){
        return "Jelouda";
    }

}



