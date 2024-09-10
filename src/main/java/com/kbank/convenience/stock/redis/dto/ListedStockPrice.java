package com.kbank.convenience.stock.redis.dto;

import lombok.*; 

import java.io.Serializable; 
import java.time.LocalDateTime; 

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ListedStockPrice implements Serializable {
    private LocalDateTime baseDateTime;  
    private String itemCodeNumber;  
    private String stockKoreanName;  
    private Long openPrice;  
    private Long highPrice;  
    private Long lowPrice;  
    private Long closePrice;  
    private Long volume;  
    private Long value;  
    private Long changePrice;
    private Double changeRate;  
    private Long alreadyIssuedStock;
    private Long marketPriceTotal;
    private Boolean tradingStop;  
}
