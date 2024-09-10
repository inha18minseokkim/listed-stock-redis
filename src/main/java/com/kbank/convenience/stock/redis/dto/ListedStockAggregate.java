package com.kbank.convenience.stock.redis.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ListedStockAggregate implements Serializable {
    private String symbol;
    private String entity_name;
    private Double open;
    private Double high;
    private Double low;
    private Long volume;
    private Double change;
    private Double value;
    private Double change_percent;
    private Boolean trading_halted;
    private Double market_cap;
    private Long shares_listed;
    private Double close;
}
