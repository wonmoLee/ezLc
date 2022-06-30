package com.ez.domain;

import lombok.Data;

@Data
public class BoardVO {
	private Long BNO;
	private String TITLE;
	private String CONTENT;
	private String REG_ID;
	private String REG_DT;
	private String REG_IP;
	private String MOD_ID;
	private String MOD_DT;
	private String MOD_IP;
}
