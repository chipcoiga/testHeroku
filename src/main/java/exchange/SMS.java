package exchange;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

public class SMS {

  // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "SKc42ba5bc233730172ff6a2a90658fe12";
  public static final String AUTH_TOKEN = "tZSxDzq2iYS4XhQVnESQaV6ywIdUwNus";

  public static void main(String[] args) throws TwilioRestException {
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

    // Build a filter for the MessageList
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("Body", "Hello from Java"));
    params.add(new BasicNameValuePair("To", "+12345678901"));
    params.add(new BasicNameValuePair("From", "+12345678901"));

    MessageFactory messageFactory = client.getAccount().getMessageFactory();
    try {
      Message message = messageFactory.create(params);
    } catch (TwilioRestException e) {
      System.out.println(e.getErrorMessage());
    }
  }
}