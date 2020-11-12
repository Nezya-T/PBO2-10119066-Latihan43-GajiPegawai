/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan43.gajipegawai;


/**
 *
 * @author Neyza-T
 * Nama   : Nezya Tariska
 * Kelas  : IF2
 * Nim    : 10119066
 */
public class PBO210119066Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gape = new GajiPegawai();
        gape.setNama("Nezya Tariska");
        gape.setAlamat("jl. melati putri no.45");
        gape.setUangTunjangan(3000000);
        gape.setGajiPokok(4500000);
        gape.setUangTransport(250000);
        gape.totalGaji(gape.getUangTunjangan(), gape.getUangTransport(), gape.getGajiPokok());
        gape.tampilData(gape.getNama(), gape.getAlamat(), gape.getUangTunjangan(), gape.getUangTransport(), gape.getGajiPokok(), gape.getTotalGaji());
        
    }
    
}
