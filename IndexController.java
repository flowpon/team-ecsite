package jp.co.internous.team2504.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.team2504.model.domain.MstCategory;
import jp.co.internous.team2504.model.domain.MstProduct;
import jp.co.internous.team2504.model.form.SearchForm;
import jp.co.internous.team2504.model.mapper.MstCategoryMapper;
import jp.co.internous.team2504.model.mapper.MstProductMapper;
import jp.co.internous.team2504.model.session.LoginSession;

/**
 * 商品検索に関する処理を行うコントローラー
 * @author インターノウス
 *
 */
@Controller
@RequestMapping("/team2504")
public class IndexController {

	/*
	 * フィールド定義
	 */
	@Autowired
	private MstProductMapper productMapper;

	@Autowired
	private MstCategoryMapper categoryMapper;
	
	@Autowired
	private LoginSession session;
	
	/**
	 * トップページを初期表示する。
	 * @param m 画面表示用オブジェクト
	 * @return トップページ
	 */
	@RequestMapping("/")
	public String index(Model m) {
		if (!session.getIsLoggedIn() && session.getTmpUserId() == 0) {
			Random random = new Random();
			int randomNumber = random.nextInt(900000000) + 100000000;
			session.setTmpUserId(-randomNumber);
		}

		List<MstProduct> products = productMapper.find();
		List<MstCategory> categories = categoryMapper.find();
		
		m.addAttribute("products", products);
		m.addAttribute("categories", categories);
		m.addAttribute("loginSession", session);
		
		return "index";

	}

	/**
	 * 検索処理を行う
	 * @param f 検索用フォーム
	 * @param m 画面表示用オブジェクト
	 * @return トップページ
	 */
	@RequestMapping("/searchItem")
	public String searchItem(SearchForm f, Model m) {

		String keywords = f.getKeywords();
		if (keywords != null) {
			keywords = keywords.replace("　", " ").replaceAll(" +", " ").trim();
		}

		List<MstProduct> products = null;

		if (f.getCategory() > 0 && keywords != null && !keywords.isEmpty()) {
			String[] keywordsArr = keywords.split(" ");
			products = productMapper.findByCategoryAndProductName(f.getCategory(), keywordsArr);
		} else if (f.getCategory() > 0) {
			String[] emptyKeywords = new String[0];
			products = productMapper.findByCategoryAndProductName(f.getCategory(), emptyKeywords);
		} else if (keywords != null && !keywords.isEmpty()) {
			String[] keywordsArr = keywords.split(" ");
			products = productMapper.findByProductName(keywordsArr);
		} else {
			products = productMapper.find();
		}

		List<MstCategory> categories = categoryMapper.find();

		m.addAttribute("categories", categories);
		m.addAttribute("products", products);
		m.addAttribute("selected", f.getCategory());
		m.addAttribute("keywords", keywords);
		m.addAttribute("loginSession", session);
		
		return "index";

	}
}
