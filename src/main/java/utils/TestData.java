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
        public String costcenter;
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

    public static class UploadIBI
    {
        public String titleIBI;
        public String descIBI;
        public String authors;
        public String countries;
        public String stream;
        public String tos;
        public String entity;
        public String confidentiality;
        public String pathfile;
    }
    public UploadIBI uploadibi;


    public static class OrderConsumption
    {
        public String contactNumber;
        public String namaKegiatan;
        public String jumlahHari;
        public String jumlahPeserta;
        public String tanggalKegiatan;
        public String jamAwal;
        public String jamAkhir;
        public String jenisKegiatan;
        public String pesertaKegiatan;
        public String levelJabatan;
        public String gedung;
        public String lantai;
        public String ruangan;
        public String jenisKonsumsi;
        public String jenisKonsumsiKedua;
        public String menuKonsumsi;
        public String menuKonsumsiKedua;
        public String jumlahMenu;
        public String jamPengantaran;
    }
    public OrderConsumption orderconsumption;

    public static class TopUpSaldo
    {
        public String kategoriSaldo;
        public String directoryFile;
    }
    public TopUpSaldo topupsaldo;


}
