package com.example.votacaosimposioseguranca;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private Button btnVotar;
	private EditText txtNota;
	
	double nota;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);

//		txtNota = (EditText) findViewById(R.id.txtNota);
//		btnVotar = (Button) findViewById(R.id.btnVotar);
//		btnVotar.setOnClickListener(new View.OnClickListener() {

//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//
//				nota = Double.parseDouble((txtNota.getText().toString()));
//				HttpClient client = new DefaultHttpClient();
//				HttpPost post = new HttpPost(Constantes.URL);
//				try {
//					List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(
//							2);
//					nameValuePairs.add(new BasicNameValuePair("nota", String
//							.valueOf(nota)));
//					post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
//					HttpResponse response = client.execute(post);
//					String responseXml = EntityUtils.toString(response
//							.getEntity());
//					System.out.println(responseXml);
//				} catch (Exception e) {
//				}
//			}
//		});
	}

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }

}
