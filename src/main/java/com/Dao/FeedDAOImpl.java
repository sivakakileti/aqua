package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Feed;

@Repository

public class FeedDAOImpl implements FeedDAO{
	@Autowired
	EntityManager entityManager;
	@Autowired
	 SessionFactory sessionFactory;
	@Autowired
	Session session;

	@Override
	@Transactional
	public List<Feed> getAllFeedDetails() {
		Query<Feed> q=session.createQuery(" from Feed",Feed.class);
		return q.getResultList();
		
		
	}

	@Override
	@Transactional
	public void saveFeedDetails(Feed feed) {
		session.save(feed);
		
	}

	@Override
	@Transactional
	public void saveMultiFeedDetails(List<Feed> feeds) {
		for(Feed f: feeds) {
		session.save(f);
		}
		
	}

	@Override
	@Transactional
	public List<Feed> getParticularDayFeedDetails(String date) {
		String hql="select feed from Feed feed where feed.feedPk.date= :date";
		Query query=session.createQuery(hql);
		query.setParameter("date", date);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void updateFeedDetails(Feed feed) {
		session.saveOrUpdate(feed);
		
	}

	@Override
	@Transactional
	public void updateMultiFeedDetails(List<Feed> feeds) {
		for(Feed f: feeds) {
		session.saveOrUpdate(f);
		}
		
	}

	@Override
	@Transactional
	public void deleteFeedDetail(Feed feed) {
		Feed delFeed=session.get(Feed.class, feed.getFeedPk());
		session.delete(delFeed);
		
		
	}

}
