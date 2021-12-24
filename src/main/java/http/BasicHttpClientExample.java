package http;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class BasicHttpClientExample {

  public static void main(String[] args) throws IOException, InterruptedException {

    CloseableHttpClient httpclient = HttpClients.createDefault();
    HttpPost httpPost = new HttpPost("http://localhost:8100/test");
    String JSON_STRING = "";
    HttpEntity stringEntity = new StringEntity(JSON_STRING, ContentType.APPLICATION_JSON);
    httpPost.setEntity(stringEntity);
    CloseableHttpResponse response2 = httpclient.execute(httpPost);
  }
}
