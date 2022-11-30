import java.util.HashMap;

public class CustomerInfo {
    HashMap<String,String> signInInfo = new HashMap<String,String>();

    CustomerInfo() {
        signInInfo.put("123","tio");
        signInInfo.put("678","admin");
        signInInfo.put("470","ethan");
    }

    protected HashMap getSignInInfo() {
        return signInInfo;
    }
}
