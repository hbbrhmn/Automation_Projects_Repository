package utils;


import java.util.Map;

public class TestData {

    public static class User
    {
        public String email;
        public String password;
    }

    public static class DraftCekFisik
    {
        public String title;
        public String location;
        public String direktorat;
        public String assetnumber;
        public String keterangan;
        public String filepath;
        public String assetholder;
        public String keuangan;
        public String hssesafetyandsecurity;
        public String ahli;
        public String assetholderowner;
    }
    public static class ApprovalRemark{
        public String approveremark;
        public String reviseremark;
    }

    public Map<String, User> users; // <--- menyimpan user berdasarkan role
    public DraftCekFisik draftcekfisik;
    public ApprovalRemark approvalremark;
}
