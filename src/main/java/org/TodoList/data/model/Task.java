package org.TodoList.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
@Getter
@Setter
public class Task {
    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;
    @Builder.Default
    private LocalDate createdAt = LocalDate.now();
    private LocalDate updatedAt;
}
