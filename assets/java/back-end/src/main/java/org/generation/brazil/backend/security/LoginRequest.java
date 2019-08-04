package org.generation.brazil.backend.security;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

  @NotBlank
  private String usernameOrEmail;

  @NotBlank
  private String password;

}