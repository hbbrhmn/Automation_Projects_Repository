package utils;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;

public class JsonDataReader {

    private static TestData data;

    static {
        try {
            String resourcePath = "testdata/dataparadize.json"; // relative dari src/test/resources
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            InputStream is = cl.getResourceAsStream(resourcePath);

            if (is == null) {
                throw new RuntimeException("File tidak ditemukan di classpath: " + resourcePath
                        + " (pastikan ada di src/test/resources/testdata/)");
            }

            ObjectMapper mapper = new ObjectMapper()
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            data = mapper.readValue(is, TestData.class);

            // Validasi minimal agar error-nya jelas
            if (data.users == null) {
                throw new RuntimeException("Key 'users' tidak ditemukan di dataparadize.json (case sensitive).");
            }
        } catch (Exception e) {
            throw new RuntimeException("Gagal membaca dataparadize.json", e);
        }
    }

    //Ambil user berdasarkan role (conceptor, coordinator, dsb)
    public static TestData.User getUser(String role) {
        TestData.User user = data.users.get(role);
        if (user == null) {
            throw new RuntimeException("Role user '" + role + "' tidak ditemukan di testdata.json");
        }
        return user;
    }

    //Paradize
    //Ambil data draft
    public static TestData.DraftCekFisik getDraftCekFisik() {
        return data.draftcekfisik;
    }
    //Ambil data remark
    public static TestData.ApprovalRemark getApprovalRemark(){
        return data.approvalremark;
    }


}
