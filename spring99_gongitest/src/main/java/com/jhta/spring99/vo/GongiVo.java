package com.jhta.spring99.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GongiVo {

	private int num;
	private String writer;
	private String title;
	private String content;
	private Date regdate;
}
