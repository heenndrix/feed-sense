package dev.hendrix.FeedSense.mappers;

import dev.hendrix.FeedSense.FeedbackResponseDto;
import dev.hendrix.FeedSense.dto.FeedbackRequestDto;
import dev.hendrix.FeedSense.entities.Feedback;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {UserMapper.class, SentimentAnalysisResultMapper.class})
public interface FeedbackMapper {


    FeedbackResponseDto toDTO(Feedback feedback);

    Feedback toEntity(FeedbackRequestDto dto);
}
