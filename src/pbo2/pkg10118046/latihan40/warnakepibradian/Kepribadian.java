/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan40.warnakepibradian;

/**
 *
 * @author ASUS
 */



public class Kepribadian {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    
    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    private String warna, nama;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilKepribadian() {
        warna = warna.toUpperCase();
        nama = nama.toUpperCase();
        System.out.println("\n======HASIL TEST KEPRIBADIAN " + nama + "======");
        switch (warna) {
            case "BIRU" : 
                warnaBiru();
            break;
            case "MERAH":
                warnaMerah();
            break;
            case "KUNING":
                warnaKuning();
            break;
            case "UNGU":
                warnaUngu();
            break;
            case "HIJAU":
                warnaHijau();
            break;
                default:
            System.out.println("Ooopps.. Belum teridentifikasi");
        }
    }
    
    private void warnaMerah() {
        System.out.println("Warna Favoritmu Adalah "+ANSI_RED + warna);
         System.out.println("1. Periang,\n2. Pemberani,\n3. Berani mengambil resiko dalam setiap masalah,\n4. Menyukai tantangan,\n5. Kurang sabar,\n6. Dapat menahan marah namun jika sudah tahap puncak toleransi amarahnya akan sulit dikontrol,\n7. Memiliki energi kehangatan dan cinta.");
           
    }
    
    private void warnaBiru() {
        System.out.println("Warna Favoritmu Adalah " + ANSI_BLUE + warna);
        System.out.println("1. Menyenangkan,\n2. Bijaksana,\n3. Pembawaan diri tenang saat menghadapi masalah,\n4. Dinamis,\n5. Senang berbagi,\n6. Bersahabat,\n7. Tidak terlalu suka menjadi sorotan banyak orang,\n8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }
    
    private void warnaUngu() {
        System.out.println("Warna Favoritmu Adalah "+ANSI_PURPLE+warna);
        System.out.println("1. Optimis,\n2. Tidak pernah ragu,\n3. Menurut pasangan yang ideal adalah yang memiliki mental yang kuat,\n4. Memiliki ambisi yang besar,\n5. Memiliki empati yang kuat,\n6. Memiliki sisi misterius sebab seringkali menutupi perasaanya,\n7. Terkadang bersikap keras kepala dan angkuh");
            
    }
    
    private void warnaKuning() {
        System.out.println("Warna Favoritmu Adalah "+ANSI_YELLOW + warna);
        System.out.println("1. Optimis,\n2. Suka bergaul,\n3. Periang,\n4. Senang menolong,\n5. Linvah dan aktif,\n6. Tidak suka meremehkan kekurangan orang lain,\n7. Loyal,\n8. Hangat,\n9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,\n10. Cenderung penakut");
               
    }
    
    private void warnaHijau() {
        System.out.println("Warna Favoritmu Adalah "+ANSI_GREEN + warna);
        System.out.println("1. Romantis,\n.2 Menyukai hal yang berbau alami dan keindahan,\n3. Tegah pada prinsip,\n4. Menginginkan kesempurnaan\n5. Mudah cemburu,\n7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan");        
    }
}
