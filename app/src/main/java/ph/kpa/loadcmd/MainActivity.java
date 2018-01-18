package ph.kpa.loadcmd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    private WebView webView;
    private String urlHost = "http://home.kpa.ph:5000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        webView=(WebView)findViewById(R.id.webView1);
        webView.setWebViewClient(new MyWebViewClient());
        openURL();
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    private void openURL() {
        webView.loadUrl(urlHost);
        webView.requestFocus();
    }
}
