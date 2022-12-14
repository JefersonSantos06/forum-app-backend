package br.com.forumapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long userId;
    @NotBlank(message = "Username é obrigatório")
    private String username;
    @NotBlank(message = "Password é obrigatório")
    private String password;
    @Email
    @NotEmpty(message = "Email é obrigatório")
    private String email;
    private Instant created;
    private boolean enabled;
}
