package com.spring.springTest.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor /* 모든 변수 생성자 */
public class WebSiteVo {

	private String driver;
	private String url;
	private String user;
	private String password;
	
}
