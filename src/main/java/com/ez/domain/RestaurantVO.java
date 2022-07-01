package com.ez.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantVO {
	private String UC_SEQ;
	private String MAIN_TITLE;
	private String GUGUN_NM;
	private String LAT;
	private String LNG;
	private String PLACE;
	private String TITLE;
	private String SUBTITLE;
	private String ADDR1;
	private String ADDR2;
	private String CNTCT_TEL;
	private String HOMEPAGE_URL;
	private String USAGE_DAY_WEEK_AND_TIME;
	private String RPRSNTV_MENU;
	private String MAIN_IMG_NORMAL;
	private String MAIN_IMG_THUMB;
	private String ITEMCNTNTS;
}
