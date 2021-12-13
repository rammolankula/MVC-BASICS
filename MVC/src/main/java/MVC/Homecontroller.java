package MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Homecontroller {
	
	/* SOME CONTROLLER PRECAUTIONS
	 * 1)Requestmapping as path it will take GETMAPPING
	 * 2)it wont take the same URL's path
	 * 3)if the URL's are same we need to specify the method.type
	 * 4)Example::::-method=RequestMethod.POST
	 * 5)Example::::-method=RequestMethod.GET
	 * 6)if want call the .html we need to store the html file in main-->webapps-->WEBINF-->pages-->.html
	 * HERE IAM WORKING ON 
	 * it wont work for same url but if we use same URls we need to mention method type example::method=RequestMethod.GET
	 * */
	
	@RequestMapping(value="/show")//,method=RequestMethod.GET)
	public String show() {
		return "home";
	}
	
	@RequestMapping(value="/come",method=RequestMethod.POST)
	public String flow() {
		return "success";
	}
	@RequestMapping(value="/showhome",method=RequestMethod.POST)
	public String Ganesh() {
		return "Ganesh";
	}

}
