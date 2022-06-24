package com.ez.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private String REG_ID;
	private Date REG_DT;
	private String REG_IP;
	private String MOD_ID;
	private Date MOD_DT;
	private String MOD_IP;
}
