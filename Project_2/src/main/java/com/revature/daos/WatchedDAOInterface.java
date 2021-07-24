package com.revature.daos;

import com.revature.models.Watched;

public interface WatchedDAOInterface 
{
	public void addWatched(Watched newList);
	
	public Watched getWatchedByUserId(int id);
	
	public boolean isEmpty(int id);
	
	public void updateWatched(Watched list);
	
	public boolean isPresent(int user_id, int video_id);
}
