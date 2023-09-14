package com.xworkz.spotify.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="spotify")
@Entity
@NamedQuery(name = "read" ,query="select dto from SongDto dto")
@NamedQuery(name = "findByName" ,query="select dto from SongDto dto where dto.songName=:nm")

public class SongDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String songName;
	private String ArtistName;
	private int releasedIn;
	private float rating;
	private String album;
	
	
	public SongDto() {
	  System.out.println("dto");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public String getArtistName() {
		return ArtistName;
	}


	public void setArtistName(String artistName) {
		ArtistName = artistName;
	}


	public int getReleasedIn() {
		return releasedIn;
	}


	public void setReleasedIn(int releasedIn) {
		this.releasedIn = releasedIn;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	
	
	public SongDto(String songName, String artistName, int releasedIn, float rating, String album) {
		super();
		this.songName = songName;
		ArtistName = artistName;
		this.releasedIn = releasedIn;
		this.rating = rating;
		this.album = album;
	}


	@Override
	public String toString() {
		return "SongDto [id=" + id + ", songName=" + songName + ", ArtistName=" + ArtistName + ", releasedIn="
				+ releasedIn + ", rating=" + rating + ", album=" + album + "]";
	}
	
	

}
