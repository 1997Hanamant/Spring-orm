package com.xworkz.songsandfood.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SongDTO implements Serializable{
	private String name;
	private String singer;
	private String duration;
	private String producer;
	private String lyrics;
	private String language;
	private String type;

}
