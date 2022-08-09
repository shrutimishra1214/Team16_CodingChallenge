package com.db.grad.javaapi.controller;

import java.util.List;

import com.db.grad.javaapi.model.Bond;
import com.db.grad.javaapi.model.Employee;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.services.BondServices;
import com.db.grad.javaapi.services.TradeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView; 


@Controller
public class EmployeeController {
	
	@Autowired
	BondServices service;
	TradeServices trade_service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Bond> listBond = service.listAll(); // CHECKKKKKK
		model.addAttribute("listBond",listBond);
		return "index";
	}
	
	@RequestMapping("/new")
	public String newBondPage(Model model) {
		Bond bond=new Bond();
		model.addAttribute(bond);
		return "new_bond";
	}
	
	@RequestMapping("/new_trade")
	public String newTradePage(Model model) {
		Trade trade=new Trade();
		model.addAttribute(trade);
		return "new_trade";
	}
	
	@RequestMapping(value = "/save_trade", method =RequestMethod.POST)
	public String saveTrade(@ModelAttribute("trade") Trade trade) {
		trade_service.save(trade);
		return "redirect:/"; //, @RequestParam("bid") Long bid ; detail/{trade.bid}
	}
	
	@RequestMapping(value = "/save", method =RequestMethod.POST)
	public String saveBond(@ModelAttribute("bond") Bond bond ) {
		service.save(bond);
		return "redirect:/";
	}
	
	/*@RequestMapping("/detail/{bid}")
	public ModelAndView showDetailBondPage(@PathVariable (name="bid") Long bid, Model model) {
		ModelAndView mav=new ModelAndView("detail_bond");
		Bond bond=service.get(bid);
		mav.addObject("bond",bond);
		List<Trade> listTrade = trade_service.listAll();
		model.addAttribute("listTrade",listTrade);
		//Trade trade=service.get(bid);
		//mav.addObject("trade",trade);
		return mav;
	}*/
	
	@RequestMapping("/detail/{bid}")
	public String showDetailBondPage(@PathVariable (name="bid") Long bid, Model model) {
		Bond bond=service.get(bid);
		model.addAttribute("bond",bond);
		//List<Trade> listTrade = trade_service.listAll();
		//model.addAttribute("listTrade",listTrade);
		//Trade trade=service.get(bid);
		//mav.addObject("trade",trade);
		return "detail_bond";
	}

	

}

