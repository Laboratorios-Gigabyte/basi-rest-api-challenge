package mx.com.gigabyte.labs.basicrestapi.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseApi {

  @JsonProperty("api_response")
  private String response;

}
