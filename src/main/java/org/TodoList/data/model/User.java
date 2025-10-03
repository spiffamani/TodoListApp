package org.TodoList.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
@Getter
@Setter

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @Builder.Default
    private LocalDate createdAt = LocalDate.now();
    private LocalDate updatedAt;
}
