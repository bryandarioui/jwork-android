package bryandariolesmana.jwork_android;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * insiasi class
 */
public class JobSelesaiRequest extends StringRequest {
    private static final String URL = "http://10.0.2.2:8080/invoice/invoiceStatus";
    private Map<String, String> params;

    /**
     * consructor untuk Job Selesai Request
     * @param id
     * @param listener
     */
    public JobSelesaiRequest(String id, Response.Listener<String> listener){
        super(Method.PUT, URL,  listener, null);
        params = new HashMap<>();
        params.put("id", id);
        params.put("invoiceStatus", "Finished");
    }
    /**
     * method getParam untuk Job Selesai Request
     * @return param
     * @throws AuthFailureError
     */
    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
