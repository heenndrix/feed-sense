package dev.hendrix.FeedSense;

import dev.hendrix.FeedSense.dto.SentimentAnalysisResultDto;
import dev.hendrix.FeedSense.dto.UserDto;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class FeedbackResponseDto {
    private Long id;
    private String content;
    private SentimentAnalysisResultDto analysisResult;
    private UserDto user;
    private LocalDateTime createdAt;
}
