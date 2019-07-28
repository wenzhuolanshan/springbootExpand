package com.chinasoft.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Embeddable
public class Money implements Serializable {

    private static final long serialVersionUID = 6191947084503055149L;

    private String currency;

    private BigDecimal amount;
}
