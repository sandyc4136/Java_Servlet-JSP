package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.AlbumDao;
import com.cdac.dao.SongDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongApp {
	public static void main(String[] args) {
		
		AlbumDao Adao = new AlbumDao();
		SongDao Sdao = new SongDao();
		
		// Scenario 1: Adding an album first
	/*	Album album = new Album();
		album.setName("Hits of 2021");
		album.setReleaseDate(LocalDate.of(2021, 12, 25));
		album.setCopyright("Sony Music");
		Adao.add(album); */
		
		//scenario 2: adding song for an album
		// but first link album and song 
		Album album = Adao.fetchAlbumById(2);
		Song song = new Song();
		song.setTitle("Dil Galti kar baitha hai");
		song.setArtist("Jubin Nautiyal");
		song.setDuration(3.82);
		song.setAlbum(album);
		Sdao.add(song); 
	}
}
 