package com.example.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MerchandiseSession implements Serializable{
	private static final long serialVersionUID = 1L;

	// 商品名
	String Merchandise;
	// メーカー
	String maker;
	// 値段
	Integer price;
	// 購入数
	Integer need;
}
