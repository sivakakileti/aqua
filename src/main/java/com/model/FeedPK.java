package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class FeedPK  implements Serializable{
	 private static final long serialVersionUID = 1L;
	
	public String date;
	public int feedNo;
	
	public FeedPK(String date, int feedNo) {
		this.date = date;
		this.feedNo = feedNo;
	}
	
	public FeedPK() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + feedNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeedPK other = (FeedPK) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (feedNo != other.feedNo)
			return false;
		return true;
	}
	
	

}
