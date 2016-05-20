package com.june.simplesns.member.domain;

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
	@Column(name = "ID")
	private String id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PASSWORD")
	private String password;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createdDate;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date modifiedDate;
}
