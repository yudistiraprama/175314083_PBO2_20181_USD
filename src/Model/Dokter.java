/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asus
 */
public class Dokter {

    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    /**
     * constructor untuk mendeklarasikan objek Dokter
     */
    public Dokter() {

    }

    /**
     * constructor untuk mendeklarasikan objek Dokter dengan parameter lokal
     * nama dengan tipe data String
     *
     * @param nama
     */
    public Dokter(String nama) {
        // pernyataan bahwa nilain variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel nomorPegawai
     *
     * @return
     */
    public String getNomorPegawai() {
        //pengambalian nilai dari variabel nomorPegawai
        return nomorPegawai;
    }

    /**
     * method untuk meng-set nilai dari variabel nomorPegawai dengan variabel
     * lokal nomorPegawai dengan tipe data String
     *
     * @param nomorPegawai
     * @throws Exception
     */
    public void setNomorPegawai(String nomorPegawai) throws Exception {
        //pengecekan panjang karakter variabel lokal nomorPegawai harus sama dengan 5 
        if (nomorPegawai.length() == 5) {
            //pernyataan bahwa nilai variabel nomorPegawai sama dengan nilai dari variabel lokal nomorPegawai ditambah 3 huruf awal dari variabel nama
            this.nomorPegawai = (nomorPegawai + nama.substring(0, 3));
        } else {
            // pesan apabila input nomorPegawai salah
            throw new Exception("No Pegawai Salah");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel nama
     *
     * @return
     */
    public String getNama() {
        //pengambalian nilai dari variabel nama
        return nama;
    }

    /**
     * method untuk meng-set nilai dari variabel nama dengan variabel lokal nama
     * dengan tipe data String
     *
     * @param nama
     */
    public void setNama(String nama) {
        // pernyataan bahwa nilai dari variabel nama sama dengan nilai dari variabel lokal nama
        this.nama = nama;
    }

    /**
     * method untuk mengambil nilai dari variabel alamat
     *
     * @return
     */
    public String getAlamat() {
        //pengambalian nilai dari variabel alamat
        return alamat;
    }

    /**
     * method untuk mengset nilai dari variabel alamat dengan parameter lokal
     * alamat yang bertipe String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        // pernyataan bahwa nilai dari variabel alamat sama dengan nilai dari variabel lokal alamat
        this.alamat = alamat;
    }

    /**
     * method untuk mengambil nilai dari variabel tempatLahir
     *
     * @return
     */
    public String getTempatLahir() {
        //pengambalian nilai dari variabel tempatLahir
        return tempatLahir;
    }

    /**
     * method untuk mengset nilai dari variabel tempatLahir dengan parameter
     * lokal tempatLahir yang bertipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        // pernyataan bahwa nilai dari variabel tempatLahir sama dengan nilai dari variabel lokal tempatLahir
        this.tempatLahir = tempatLahir;
    }

    /**
     * method untuk mengambil nilai dari variabel tanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        //pengambalian nilai dari variabel tanggalLahir
        return tanggalLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tanggalLahir dengan variabel
     * lokal tanggalLahir dengan tipe data String
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        //pengecekan nilai variabel lokal tanggalLahir harus lebih dari 0
        if (tanggalLahir > 0) {
            //pengecekan nilai variabel lokal tanggalLahir harus kurang dari sama dengan 31
            if (tanggalLahir <= 31) {
                //pernyataan bahwa nilai dari variabel tanggalLahir sama dengan nilai dari variabel lokal tanggalLahir
                this.tanggalLahir = tanggalLahir;
            } else {
                // pesan apabila input tanggalLahir lebih dari 31 
                throw new Exception("Input Tanggal Lebih Dari 31");
            }
        } else {
            // pesan apabila input tanggalLahir kurang dari 0 
            throw new Exception("Input Tanggal Kurang Dari 0");
        }
    }

    public int getBulanLahir() {
        // pengambalian nilai dari variabel bulanLahir
        return bulanLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel bulanLahir dengan variabel
     * lokal bulanLahir dengan tipe data String
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        //pengecekan nilai variabel lokal bulanLahir harus lebih dari 0
        if (bulanLahir > 0) {
            //pengecekan nilai variabel lokal bulanLahir harus kurang dari sama dengan 12
            if (bulanLahir <= 12) {
                //pernyataan bahwa nilai dari variabel bulanLahir sama dengan nilai dari variabel lokal bulanLahir
                this.bulanLahir = bulanLahir;
            } else {
                // pesan apabila input bulanLahir lebih dari 12
                throw new Exception("Input Bulan Lebih Dari 12");
            }
        } else {
            // pesan apabila input bulanLahir kurang dari 0 
            throw new Exception("input Bulan Kurang Dari 0");
        }

    }

    /**
     * method untuk mengambil nilai dari variabel tahunLahir
     *
     * @return
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tahunLahir dengan variabel
     * lokal tahunLahir dengan tipe data String
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        //pengecekan nilai variabel lokal tahunLahir harus lebih dari 0
        if (tahunLahir > 0) {
            //pernyataan bahwa nilai dari variabel tahunLahir sama dengan nilai dari variabel lokal tahunLahir
            this.tahunLahir = tahunLahir;
        } else {
            // pesan apabila input tahunLahir
            throw new Exception("Salah Input Tahun");
        }
    }

}
