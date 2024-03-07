package com.example.bean;

import lombok.Data;

/**
 * 検索formクラス
 * @author d.gotan
 */
@Data
public class MerchandiseForm {
	// 商品名
	String Merchandise;
	// メーカー
	String maker;
	//値段
	Integer price;
	//商品タグ
	Integer need;
}
