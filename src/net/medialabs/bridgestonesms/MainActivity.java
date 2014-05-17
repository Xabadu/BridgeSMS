package net.medialabs.bridgestonesms;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	private static final String URL_WEBAPP = "http://www.solucionesparche.com/labs/bridgestone/index.php/webapp/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WebView webView = new WebView(this);
		webView.setWebViewClient(new WebViewClient());
		setContentView(webView);
		webView.loadUrl(URL_WEBAPP);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
