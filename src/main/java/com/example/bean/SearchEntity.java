package com.example.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "kandahurusearh")
public class SearchEntity {
	// 商品ID
	@Id
	private Integer id;
	// 商品名
	private String merchandise;
	// メーカー
	private String maker;
	// 値段
	private int price;
	// 商品タグ1
	private String merchandisetag1;
	// 商品タグ2
	private String merchandisetag2;
	// 数量
	private int stock;
	// 画像ファイルパス
	private String filepath;
}
