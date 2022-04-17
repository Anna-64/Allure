package ru.netology.domain.entities;

import lombok.Data;


@Data
public class RegistrationInfo {

    private final String city;
    private final String name;
    private final String phone;
}

