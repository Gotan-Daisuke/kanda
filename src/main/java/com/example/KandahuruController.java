package com.example;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.bean.SearchEntity;
import com.example.bean.SearchForm;
import com.example.service.KandahuruService;

@Controller
public class KandahuruController {

	//serviceクラスの呼び出し
	 @Autowired
	 private KandahuruService service;

	/**
	 *
	 * @param model
	 * @param form
	 * @return kandahuruSearch
	 */
	@GetMapping("/form")
	public String getSearch(Model model,
			@ModelAttribute SearchForm form) {

        //Entity定義
        List<SearchEntity> searchEntity;

        //nullチェック※ここ
        searchEntity = service.findlist(form);

        SearchForm searchForm = service.form(form);

		//検索フォーム
		model.addAttribute("form",searchForm);

		//検索結果表示（初期全件表示）
		model.addAttribute("entity",searchEntity);
		return "kandahuruSearch";
	}
	/**
	 *
	 * @param model
	 * @param form
	 * @return kandahuruMerchandise
	 */
	@GetMapping("/merchandise")
	public String getMerchandise(Model model) {
		return "kandahuruMerchandise";
	}

}
