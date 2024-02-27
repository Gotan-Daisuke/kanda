package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bean.MerchandiseEntity;
import com.example.bean.SearchEntity;
import com.example.service.KandahuruService;

//@SessionAttributes(types = MerchandiseSession.class) 
@Controller
public class MerchandiseController {
	
	// serviceクラスの呼び出し
	 @Autowired
	 private KandahuruService service;
	 
	/**
	 * 商品画面
	 * @param model
	 * @param form
	 * @return kandahuruMerchandise
	 */
	@GetMapping("/merchandise")
	public String getMerchandise( Model model,
//			@ModelAttribute MerchandiseSession ms,
			@RequestParam("id") Integer id) {

        // Entity定義
        Optional<SearchEntity> searchEntity;
        // Id検索結果取得
        searchEntity = service.findById(id);
        
        //Entity定義
        Optional<MerchandiseEntity> merchandiseEntity;
        // Id検索結果取得
        merchandiseEntity = service.mFindById(id);
        
        model.addAttribute("sentity" ,searchEntity.get());
        // 商品画像出力
		model.addAttribute("mentity",merchandiseEntity.get());
		
		return "kandahuruMerchandise";
	}
}
