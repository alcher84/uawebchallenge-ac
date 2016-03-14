package com.uawebchallenge.andriychernysh.transport;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect(
        isGetterVisibility = JsonAutoDetect.Visibility.NONE
)
public class HelloDto {

    private Long id;

    private String message;
}
