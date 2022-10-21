package com.joongbu.mybatis_board.dto;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;
	private String title;
	private String contents;
	private java.util.Date postTime;
	private String userId;
	private int views;
	private int likes;
	private int bads;
}
