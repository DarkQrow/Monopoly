/*
package com.CawCawStudio.Tests;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;

import com.CawCawStudio.R;

import org.json.JSONException;
import org.json.JSONObject;

public class TestJSONActivity extends Activity {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_window);

        new RequestTask().execute("http://www.site.ru/login.php"); // скрипт, на который посылаем запрос
    }

    public String getJSON(String login, String pass) // получаем json объект в виде строки
    {
        JSONObject bot = new JSONObject();
        try {
            bot.put("Login", login);
            bot.put("Password", pass);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bot.toString();
    }

    public class RequestTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            try {
                DefaultHttpClient hc = new DefaultHttpClient();
                ResponseHandler<String> res = new BasicResponseHandler();
                HttpPost postMethod = new HttpPost(params[0]);
                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                // ключ - "json", параметр - json в виде строки
                nameValuePairs.add(new BasicNameValuePair("json", getJSON("userlogin", "userpass")));
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(nameValuePairs, "UTF-8");
                postMethod.setEntity(entity);
                return hc.execute(postMethod, res);
            } catch (Exception e) {
                System.out.println("Exp=" + e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(String res) {

            dialog.dismiss();

            // res - ответ сервера

            super.onPostExecute(res);
        }

        @Override
        protected void onPreExecute() {
            dialog = new ProgressDialog(TestJSONActivity.this);
            dialog.setMessage("Ожидание");
            dialog.setIndeterminate(true);
            dialog.setCancelable(false);
            dialog.show();
            super.onPreExecute();
        }
    }
}*/
