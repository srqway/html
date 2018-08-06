package idv.hsiehpinghan.recaptchahtml.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/basic")
public class BasicController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/reCaptchaV2", method = RequestMethod.GET)
	public ModelAndView reCaptchaV2() {
		ModelAndView mv = new ModelAndView("basic/reCaptchaV2");
		return mv;
	}

	// @RequestMapping(value = "/queryUsers", method = RequestMethod.GET)
	// public String queryUsers(UserQueryUsersCriteria criteria, RedirectAttributes
	// redirectAttributes) throws Exception {
	// String userId = criteria.getUserId();
	// String appId = criteria.getAppId();
	// if ((userId != null) && (appId != null)) {
	// byte[] rowKey = User.buildRowKey(userId, appId);
	// User user = userService.getUser(rowKey);
	// if (user != null) {
	// List<User> users = new LinkedList<User>();
	// users.add(user);
	// redirectAttributes.addFlashAttribute("users", users);
	// }
	// }
	// redirectAttributes.addFlashAttribute("criteria", criteria);
	// return "redirect:/user/";
	// }

}
