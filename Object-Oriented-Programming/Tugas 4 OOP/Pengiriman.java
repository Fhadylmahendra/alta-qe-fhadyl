public class Pengiriman extends Barang {
    int hargaMinimal = 5000;

    public Pengiriman(float panjang, float lebar, float tinggi, float berat) {
        super(panjang, lebar, tinggi, berat);
    }

    public float hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public int hitungHarga() {
        float volume = hitungVolume();
        float beratPembulatan = Math.round(berat);

        if (volume >= 50 && beratPembulatan >= 1) {
            int harga = (int) ((volume / 50) * (beratPembulatan / 1) * hargaMinimal);
            return harga;
        } else {
            System.out.println("Error! input anda salah atau hasil tidak sesuai minimal volume atau berat barang");
        }
        return 0;
    }
}


