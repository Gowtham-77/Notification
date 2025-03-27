package com.transport.notification.domain.repository;

import com.transport.notification.domain.entity.NotificationPreference;
import com.transport.notification.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationPreferenceRepository extends JpaRepository<NotificationPreference, Long> {
    NotificationPreference findByUser(User user); // ✅ Use User object instead of userId
}

