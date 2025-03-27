package com.transport.notification.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "notification_preferences",schema = "notify")
@Data
public class NotificationPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferenceId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // ✅ Correct reference to User entity

    @Column(nullable = false)
    private boolean pushEnabled = true;

    @Column(nullable = false)
    private boolean smsEnabled = true;

    @Column(nullable = false)
    private boolean emailEnabled = true;
}

