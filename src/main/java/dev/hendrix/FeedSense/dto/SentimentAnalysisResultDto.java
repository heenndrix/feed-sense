package dev.hendrix.FeedSense.dto;

import lombok.Data;

@Data
public class SentimentAnalysisResultDto {
    private String sentimentLabel;
    private Double score;
    private String summary;
    private String suggestedAction;
    private String keywords;
    private String aiComment;
}
