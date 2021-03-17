/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus {
    public static void main(String[] abc){
        Bus3 bus = new Bus3(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        
        //penambahan penumpang
        bus.addPenumpang(2);//tambah 2 penumpang
        bus.cetakpenumpang();
        
        //penambahan penumpang
        bus.addPenumpang(1);//tambah 1 penumpang
        bus.cetakpenumpang();
        
        //penambahan penumpang
        bus.addPenumpang(2);//tambah 2 penumpang
        bus.cetakpenumpang();
        
        //penambahan penumpang
        bus.addPenumpang(2);//tambah 2 penumpang
        bus.cetakpenumpang();
    }
}
