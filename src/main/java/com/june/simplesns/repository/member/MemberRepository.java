package com.june.simplesns.repository.member;

import com.june.simplesns.domain.member.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by wayne on 2016. 5. 23..
 */
@Repository
public class MemberRepository {

	@PersistenceContext
	private EntityManager em;

	public void save(Member member) {
		em.persist(member);
	}

	public Member findOne(Long memberId) {
		return em.find(Member.class, memberId);
	}


}
