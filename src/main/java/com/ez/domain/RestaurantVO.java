package com.ez.domain;

import lombok.Data;

@Data
public class RestaurantVO {
	private long ucSeq;
	private String mainTitle;
	private String gugunNm;
	private float lat;
	private float lng;
	private String place;
	private String title;
	private String subtitle;
	private String addr1;
	private String addr2;
	private String cntctTel;
	private String homepageUrl;
	private String usageDayWeekAndTime;
	private String rprsntvMenu;
	private String mainImgNormal;
	private String mainImgThumb;
	private String itemcntnts;
}
