package com.transport.notification.domain.repository;

import com.transport.notification.domain.entity.SystemAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemAlertRepository extends JpaRepository<SystemAlert, Long> {
}

