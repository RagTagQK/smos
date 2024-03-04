package com.example.diplom.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
}
