package com.example.chyraistyle.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

public class User {
    @Entity
    @Data
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
        private Long id;

        private String username;
        private String email;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<AbstractReadWriteAccess.Item> items;
    }
}
