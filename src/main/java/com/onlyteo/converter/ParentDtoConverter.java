package com.onlyteo.converter;

import com.onlyteo.model.Child;
import com.onlyteo.model.ChildDto;
import com.onlyteo.model.Parent;
import com.onlyteo.model.ParentDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ParentDtoConverter implements Converter<Parent, ParentDto> {

    @Override
    public ParentDto convert(@NonNull Parent parent) {
        return ParentDto.builder()
                .id(parent.getId())
                .name(parent.getName())
                .children(parent.getChildren().stream().map(this::convert).collect(Collectors.toList()))
                .created(parent.getCreated())
                .modified(parent.getModified())
                .build();
    }

    private ChildDto convert(@NonNull Child child) {
        return ChildDto.builder()
                .id(child.getId())
                .name(child.getName())
                .created(child.getCreated())
                .modified(child.getModified())
                .build();
    }
}
