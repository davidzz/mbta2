package mbta2;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		RESTCaller rc = new RESTCaller ();
		URL url = constructTestURL ();
		rc.processRESTcall (url);
	}
	
	private static URL constructTestURL () throws MalformedURLException
	{
		String tempString = "http://realtime.mbta.com/developer/api/v2/routesbystop?api_key=wX9NwuHnZU2ToO7GmGR9uw&stop=place-bbsta&format=json";
		URL url = new URL(tempString);
		return url;
	}

}
