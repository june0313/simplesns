package com.june.simplesns.repository.member;

import com.june.simplesns.domain.member.Member;
import com.june.simplesns.repository.Dao;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

/**
 * Created by wayne on 2016. 5. 15..
 */
@Repository
public class MemberDao implements Dao<String, Member> {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("simplesns");

	@Override
	public void persist(Member entity) {
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}
	}

	@Override
	public void remove(Member entity) {

	}

	@Override
	public Member findById(String id) {
		return null;
	}
}
