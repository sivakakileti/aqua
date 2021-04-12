package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.FeedDAO;
import com.model.Feed;

@Service
public class FeedServiceImpl implements FeedService{
	
	@Autowired
	FeedDAO feedDao;
	

	@Override
	public List<Feed> getAllFeedDetails() {
	return 	feedDao.getAllFeedDetails();
	}

	@Override
	public void saveFeedDetails(Feed feed) {
		feedDao.saveFeedDetails(feed);
		
	}

	@Override
	public void saveMultiFeedDetails(List<Feed> feeds) {
		feedDao.saveMultiFeedDetails(feeds);
		
	}

	@Override
	public List<Feed> getParticularDayFeedDetails(String date) {
		return feedDao.getParticularDayFeedDetails(date);
	}

	@Override
	public void updateFeedDetails(Feed feed) {
		 feedDao.updateFeedDetails(feed);
		
	}

	@Override
	public void updateMultiFeedDetails(List<Feed> feeds) {
		feedDao.updateMultiFeedDetails(feeds);
		
	}

	@Override
	public void deleteFeedDetail(Feed feed) {
		feedDao.deleteFeedDetail(feed);
		
	}


}
