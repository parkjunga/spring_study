package com.mini.board.domain.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 테이블로 매핑하지 않고 자식클래스(엔티티)에 매핑정보 상속
@EntityListeners(AuditingEntityListener.class)
public class TimeEntity {

    @CreatedDate // 엔티티가 처음 저장될 때 생성일 주입하는 어노테이션
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedBy
    private LocalDateTime modifiedDate;
}
