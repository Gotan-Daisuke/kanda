package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bean.SearchEntity;
import com.example.service.KandahuruService;

@Controller
public class KandahuruController {
	
	//serviceクラスの呼び出し
	 @Autowired
	 private KandahuruService service;

	 //検索画面
	@GetMapping("/form")
	public String getSearch(Model model) {
		 List<SearchEntity> searchEntity = service.findAll();
		model.addAttribute("entity",searchEntity);
		return "kandahuruSearch";
	}

}
