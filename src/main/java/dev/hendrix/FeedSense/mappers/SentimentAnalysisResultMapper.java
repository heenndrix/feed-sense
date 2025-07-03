package dev.hendrix.FeedSense.mappers;

import dev.hendrix.FeedSense.dto.SentimentAnalysisResultDto;
import dev.hendrix.FeedSense.entities.SentimentAnalysisResult;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface SentimentAnalysisResultMapper {

    SentimentAnalysisResultDto toDTO(SentimentAnalysisResult entity);

    SentimentAnalysisResult toEntity(SentimentAnalysisResultDto dto);
}
