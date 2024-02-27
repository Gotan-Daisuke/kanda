package com.example.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MerchandiseSession implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// 商品ID
	private Integer id;
	// 商品名
	private String Merchandise;
	// メーカー
	private String maker;
	// 値段
	private Integer price;
	// 数量
	private Integer stock;
	// 画像ファイルパス
	private String filepath;
	// 購入数
	private Integer need;
}
