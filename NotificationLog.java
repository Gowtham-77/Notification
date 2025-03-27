package com.transport.notification.domain.entity;

import com.transport.notification.domain.enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_logs",schema = "notify")
@Data
public class NotificationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne
    @JoinColumn(name = "notification_id", nullable = false)
    private Notification notification; // ✅ Links to Notification table

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeliveryStatus deliveryStatus = DeliveryStatus.PENDING; // SUCCESS, FAILED, PENDING

    @Column
    private String errorMessage; // ✅ If delivery fails, store error message

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}

