package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.LocationStates;
import com.example.demo.services.CoronaVirusDataServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController 
{
	
	CoronaVirusDataServices crnService;
	
	@Autowired
	public void setCrnService(CoronaVirusDataServices crnService) {
		this.crnService = crnService;
	}


	@GetMapping("/")
	public String home(Model model)
	{
		List<LocationStates> allstates=crnService.getAllstates();
		int totalDeathsReported=allstates.stream().mapToInt(stat->stat.getLatestTotalDeaths()).sum();
		model.addAttribute("LocationStates",allstates);
		model.addAttribute("totalDeathsReported",totalDeathsReported);
		return "home";
	}

	@RequestMapping(path="/viewChart", method = RequestMethod.GET)
	public ModelAndView viewChart() {
		return new ModelAndView("viewChart").addObject("myURL", new String("http://localhost:8082/collectChartData"));
	}

	@RequestMapping(path="/collectChartData", produces = {"application/json"})
	@ResponseBody
	public List<LocationStates> collectChartData(Model m) {
		System.out.println("View Chart data:");
		List<LocationStates> allstates = crnService.getAllstates();
		int totalDeathsReported = allstates.stream().mapToInt(stat-> stat.getLatestTotalDeaths()).sum();
		m.addAttribute("LocationStates", allstates);
		m.addAttribute("totalDeathsReported", totalDeathsReported);
		return allstates;
	}
	
	

}
