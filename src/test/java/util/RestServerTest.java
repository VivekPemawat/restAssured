package util;

/**
 * Created by vpemawat on 4/9/16.
 */
public class RestServerTest {
    public String baseURL() {
        return "http://localhost";

    }
    public String port() {
        return "5000";
    }
    public String baseURLWthPort() {
        return "http://localhost"+":"+port();
    }

}
