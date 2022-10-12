/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_hotel;

/**
 *
 * @author My PC
 */
import java.util.ArrayList;
//import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class hotel2 {
    
     private final  String[] NamaKolom= {"Nama pemesan","jenis kamar","jumlah kamar","hari pesanan","Tota harga"};
    private final ArrayList<hotel> list = new ArrayList<>();
    
    public void read(JTable jt){
        DefaultTableModel dtm = new DefaultTableModel(null, NamaKolom);
        for (int i=0; i<list.size(); i++){
            Object[] ob = new Object[5];
            ob[0] = list.get(i).getism();
            ob[1]= list.get(i).Getqism();
            ob[2]= list.get(i).getkoota();
            ob[3]= list.get(i).gettootal();
            ob[4]= list.get(i).getharg();
            dtm.addRow(ob);
        }
        jt.setModel(dtm);
    };

    public void create(hotel b){
        //simpandulu
        list.add(b);
        //menampilkan pesan
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
        
    }
    public void update(hotel b){
    // perulangan
    for(int i = 0;i<list.size();i++){
      if (b.getism()==list.get(i).getism()){
    list.set(i, b);
    }
    JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
    }
    }
    
    public void delete(String nim){
        for(int i=0; i<list.size(); i++){
            if (nim ==list.get(i).getism()){
       list.remove(i);
        }  
    }JOptionPane.showMessageDialog(null, "Berhasil Dihapus!");
    
}
    
    public static void main(String[] args) {
        
    }
}
