package com.revature.daos;

import java.util.List;

import com.revature.models.Video;

public interface VideoDAOInterface 
{
	public void addVideo(Video newVideo);
	
	public List<Video> getAllVideos();
	
}
