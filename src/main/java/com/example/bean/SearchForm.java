package com.example.bean;

import lombok.Data;

/**
 * 検索formクラス
 * @author d.gotan
 */
@Data
public class SearchForm {
	//検索ボックス
	String serchbox;
	//値段
	String price;
	//商品タグ
	String tag;
}
