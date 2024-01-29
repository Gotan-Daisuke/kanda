package com.example.search;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.example.bean.SearchForm;

@Component
public class SearchComponent {
	
	public Boolean formIsNull(SearchForm form) {
		return StringUtils.isBlank(form.getSerchbox())
				&& StringUtils.isBlank(form.getPrice())
				&& StringUtils.isBlank(form.getTag())
				? true : false;
		
	}

}
