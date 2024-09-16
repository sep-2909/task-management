package com.uf.taskManagement.repository;

import com.uf.taskManagement.model.TaskDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDetailsRepository extends JpaRepository<TaskDetails, Long> {

}
