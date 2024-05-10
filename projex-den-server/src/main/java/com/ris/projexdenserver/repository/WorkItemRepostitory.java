package com.ris.projexdenserver.repository;

import com.ris.projexdenserver.domain.WorkItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkItemRepostitory extends JpaRepository<WorkItem,Long> {

}
