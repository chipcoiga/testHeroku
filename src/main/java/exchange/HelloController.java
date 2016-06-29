package exchange;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;

@Controller
public class HelloController {
	public static final String ACCOUNT_SID = "ACa670675d69e5a49daaa1f96ad5621d2d";
	  public static final String AUTH_TOKEN = "e6a26dbc3b15fd03fdf20fc2fd217b63";
	@RequestMapping("/hello")
	public String hello(Model model){
		model.addAttribute("greeting", "Hello Spring MVC");
		return "helloword";
	}
	
	@RequestMapping("sms")
	public String sms(){
		
		  TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

		    // Build a filter for the MessageList
		    List<NameValuePair> params = new ArrayList<NameValuePair>();
		    params.add(new BasicNameValuePair("Body", "Hello from Java"));
		    params.add(new BasicNameValuePair("To", "+84975735525"));
		    params.add(new BasicNameValuePair("From", "+12195953082"));

		    MessageFactory messageFactory = client.getAccount().getMessageFactory();
		    try {
		      Message message = messageFactory.create(params);
		    } catch (TwilioRestException e) {
		      System.out.println(e.getErrorMessage());
		    }
		    return "helloword";
	}
}
