package com.service;

import java.util.List;

import com.model.Feed;

public interface FeedService {

	public List<Feed> getAllFeedDetails();

	public void saveFeedDetails(Feed feed);

	public void saveMultiFeedDetails(List<Feed> feeds);

	public List<Feed> getParticularDayFeedDetails(String date);

	public void updateFeedDetails(Feed feed);

	public void updateMultiFeedDetails(List<Feed> feeds);

	public void deleteFeedDetail(Feed feed);
	

}
