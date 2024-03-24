package com.example.handleexceptiondemo.heavy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeavyResource {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String address;
}
