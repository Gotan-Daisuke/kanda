package com.example.search;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.example.bean.SearchForm;

/**
 * 検索機能Component
 * @author d.gotan
 *
 */
@Component
public class SearchComponent {

	/**
	 * Nullチェック
	 * @param form
	 * @return Boolean
	 */
	public Boolean formIsNull(SearchForm form) {
		return StringUtils.isBlank(form.getSerchbox())
				&& StringUtils.isBlank(form.getPrice())
				&& StringUtils.isBlank(form.getTag())
				? true : false;

	}

	/**
	 * priceNullチェック
	 * @param price
	 * @return Integer
	 */
	public Integer priceIsNull(String price) {
		return StringUtils.isBlank(price) ? 0 : Integer.parseInt(price);

	}
}
