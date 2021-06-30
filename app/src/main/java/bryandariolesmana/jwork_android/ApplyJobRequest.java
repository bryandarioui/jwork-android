package bryandariolesmana.jwork_android;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * inisiasi class
 */
public class ApplyJobRequest extends StringRequest {
    private Map<String, String> params;
    private static final String URL_BANK = "http://10.0.2.2:8080/invoice/createBankPayment";
    private static final String URL_WALLET = "http://10.0.2.2:8080/invoice/createEWalletPayment";
    /**
     * insiasi constructor menggunakan admin fee
     * @param jobIdList
     * @param jobseekerId
     * @param listener
     */
    public ApplyJobRequest(String jobIdList, String jobseekerId, Response.Listener<String> listener) {
        super(Method.POST, URL_BANK, listener, null);
        params = new HashMap<>();
        params.put("jobIdList", jobIdList);
        params.put("jobseekerId", jobseekerId);
        params.put("adminFee", "2500");
    }
    /**
     * inisiasi constructor menggunakan referral code
     * @param job
     * @param id
     * @param referralCode
     * @param listener
     */
    public ApplyJobRequest(String job, String id, String referralCode, Response.Listener<String> listener) {
        super(Method.POST, URL_WALLET, listener, null);
        params = new HashMap<>();
        params.put("jobIdList", job);
        params.put("jobseekerId", id);
        params.put("referralCode", referralCode);
    }
    /**
     * method untuk getParam
     * @return
     * @throws AuthFailureError
     */
    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
