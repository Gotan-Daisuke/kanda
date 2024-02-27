package com.example.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Merchandise")
public class MerchandiseEntity {
	// 商品ID
	@Id
	private Integer id;
	// 画像ファイルパス1
	private String mfilepath1;
	// 画像ファイルパス2
	private String mfilepath2;
	// 画像ファイルパス3
	private String mfilepath3;
	// 画像ファイルパス4
	private String mfilepath4;
	// 画像ファイルパス5
	private String mfilepath5;
}
