package com.kbank.convenience.stock.redis.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class ListedStockSummary {
    String itemCodeNumber;
    String stockKoreanName;
    String summaryTitle;
    List<String> summaryContents;
    String statusTitle;
    List<String> statusContents;
    LocalDateTime updatedAt;

}
