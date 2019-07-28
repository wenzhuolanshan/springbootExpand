package com.chinasoft.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "product", catalog = "mysql")
public class Product implements Serializable {

    private static final long serialVersionUID = 5485893078935928789L;

    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    private String code;

    private String name;

    private String description;

    private Money price;

}
