package com.ris.projexdenserver.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "work_items")
public class WorkItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @OneToMany(mappedBy = "work_item" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;

    @Enumerated(EnumType.STRING)
    private  WorkItemType type;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @CreatedDate
    private LocalDateTime created_at;
    @LastModifiedDate
    private LocalDateTime updated_at;
    @LastModifiedBy
    private String last_modified_by;

}



