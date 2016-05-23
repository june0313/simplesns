package com.june.simplesns.domain.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wayne on 2016. 5. 16..
 */
@Getter
@Setter
@Entity
@Table(name = "MEMBER")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 생성을 데이터베이스에 위임한다.
	@Column
	private Long memberId;

	@Column
	private String id;

	@Column(nullable = false, length = 10)
	private String name;

	@Column
	private String email;

	@Column
	private String password;

	@Lob
	private String description;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdDate;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date modifiedDate;
}
