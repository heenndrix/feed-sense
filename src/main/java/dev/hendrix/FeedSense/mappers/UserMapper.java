package dev.hendrix.FeedSense.mappers;

import dev.hendrix.FeedSense.dto.UserDto;
import dev.hendrix.FeedSense.entities.User;
import org.mapstruct.*;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "roles", expression = "java(user.getRoles().stream().map(Role::getName).collect(Collectors.toSet()))")
    UserDto toDTO(User user);
}