/*
 * package com.hcl.controllers;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.hcl.entity.Biller; import com.hcl.entity.Customer; import
 * com.hcl.service.BillerService; import com.hcl.service.CustomerService;
 * 
 * import jakarta.servlet.http.HttpSession;
 * 
 * @Controller
 * 
 * @RequestMapping("/") public class HomeController {
 * 
 * @Autowired private CustomerService customerservice;
 * 
 * @Autowired private BillerService billerservice;
 * 
 * @GetMapping public ModelAndView home(ModelAndView model) {
 * model.setViewName("home"); return model; }
 * 
 * @GetMapping("/login1") public ModelAndView login(ModelAndView modelAndView){
 * modelAndView.setViewName("login"); return modelAndView; }
 * 
 * 
 * @PostMapping("/login") public ModelAndView login(@RequestParam("email")String
 * email,@RequestParam("password")String password,HttpSession
 * session,ModelAndView modelAndView) { Customer customer =
 * customerservice.loginCustomer(email, password); Biller biller =
 * billerservice.loginBiller(email,password); if(customer!=null) {
 * session.setAttribute("customer", customer);
 * modelAndView.setViewName("redirect:/dashboard"); }else if(biller!=null) {
 * session.setAttribute("biller", biller);
 * modelAndView.setViewName("redirect:/dashboard"); }else {
 * modelAndView.addObject("message","Invalid email and password");
 * modelAndView.setViewName("login"); } return modelAndView; } //public
 * ModelAndView logout(ModelAndView modelAndView,HttpSession session) { //
 * modelAndView.clear(); //
 * session.invalidate();modelAndView.setViewName("redirect:/home"); // return
 * modelAndView; //}
 * 
 * }
 */

package com.hcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.entity.Biller;
import com.hcl.entity.Customer;
import com.hcl.service.BillerService;
import com.hcl.service.CustomerService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/") // This maps the class to the root context
public class HomeController {

	@Autowired
	private CustomerService customerservice;

	@Autowired
	private BillerService billerservice;

	@GetMapping
	public ModelAndView home(ModelAndView model) { // Resolves to src/main/resources/templates/home.html
		return model;
	}            

	@GetMapping("/login1") 
	public ModelAndView showLoginForm(ModelAndView modelAndView) {
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@PostMapping("/login") // Maps to a POST request to http://localhost:8080/login (for form submission)
	public ModelAndView processLogin(@RequestParam("email") String email,
	                                 @RequestParam("password") String password,
	                                 HttpSession session,
	                                 ModelAndView modelAndView) {
		Customer customer = customerservice.loginCustomer(email, password);
		Biller biller = billerservice.loginBiller(email, password);

		if (customer != null) {
			session.setAttribute("customer", customer);
			modelAndView.setViewName("redirect:/dashboard"); 
		} else if (biller != null) {
			session.setAttribute("biller", biller);
			modelAndView.setViewName("redirect:/dashboard"); // Assuming you have a /dashboard mapping
		} else {
			modelAndView.addObject("message", "Invalid email and password");
			modelAndView.setViewName("login"); // Stay on login page with error message
		}
		return modelAndView;
	}

    
    @GetMapping("/logout") 
    public ModelAndView logout(HttpSession session, ModelAndView modelAndView) { // Reordered parameters as often seen, but not strictly necessary
       
        session.invalidate(); 
        modelAndView.setViewName("redirect:/register"); 
        return modelAndView;
    }

	// You likely have a dashboard mapping and possibly other mappings for biller/customer specific pages
	// Example:
	@GetMapping("/dashboard")
	public ModelAndView showDashboard(HttpSession session, ModelAndView modelAndView) {
		if (session.getAttribute("customer") != null || session.getAttribute("biller") != null) {
			// Logic to determine which dashboard to show or simply show a generic one
			modelAndView.setViewName("dashboard"); // Assuming dashboard.html exists
		} else {
			modelAndView.setViewName("redirect:/login"); // Redirect to login if not authenticated
		}
		return modelAndView;
	}
}