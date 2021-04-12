package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Feed;
import com.service.FeedService;

@RestController
@RequestMapping("/feedapi")
@CrossOrigin (origins = "http://localhost:3000")
public class AuqaController {
	@Autowired
	private FeedService feedService;
	
	
	@RequestMapping("/allFeed")
	public List<Feed> getAllFeedDetails() {
		return feedService.getAllFeedDetails();
		
	}
	
	@PostMapping(value="/saveFeed",consumes="application/json")
	public void saveFeedDetails(@RequestBody Feed feed) {
		feedService.saveFeedDetails(feed);
	}
	
	@PostMapping(value="/saveMultiFeed",consumes="application/json")
	public void saveMultiFeedDetails(@RequestBody List<Feed> feeds) {
		feedService.saveMultiFeedDetails(feeds);
	}
	
	@RequestMapping("/particularFeedDetails")
	public List<Feed> getParticularFeedDetails(@RequestParam("Date") String date) {
		return feedService.getParticularDayFeedDetails(date);
	}

	@RequestMapping("/updateFeedDetails")
	public void updateFeedDetails(@RequestBody Feed feed) {
		feedService.updateFeedDetails(feed);
	}
	
	@RequestMapping("/updateMultiFeedDetails")
	public void updateFeedDetails(@RequestBody List<Feed> feed) {
		feedService.updateMultiFeedDetails(feed);
	}
	
	@RequestMapping("/deleteFeedDetails")
	public void deleteFeedDetail(@RequestBody Feed feed) {
		feedService.deleteFeedDetail(feed);
	}
	
}
