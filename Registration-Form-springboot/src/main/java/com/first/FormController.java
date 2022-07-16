package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/registration")
	public String edureka() {
		
		return "edureka";
	}
	@PostMapping("details")
	public String viewDetails(@RequestParam("cid") String cid,
			@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail, ModelMap modelmap) {
		
		modelmap.put("cid", cid);
		modelmap.put("cname", cname);
		modelmap.put("cemail", cemail);
		
		return "ViewCustomerDetail";
		
	}
}