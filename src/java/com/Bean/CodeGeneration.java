/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean;

//import com.util.utilAppBase.Dossier;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.DefaultListModel;

/**
 *
 * @author omar
 */
public class CodeGeneration {

    private static int index;
    
    /**
     *
     * @param list
     * @return
     */
    public static String getCode3(List list){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str="00"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str="00"+index;
            if (index<100 && index>=10) str="0"+index;
            if (index<1000 && index>=100) str=""+index;
            return str.toUpperCase();
        }
    }

    /**
     *
     * @param list
     * @return
     */
    public static String getCode4(List list){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str="000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str="000"+index;
            if (index<100 && index>=10) str="00"+index;
            if (index<1000 && index>=100) str="0"+index;
            if (index<10000 && index>=1000) str=""+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @return
     */
    public static String getCode6(List list){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str="00000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str="00000"+index;
            if (index<100 && index>=10) str="0000"+index;
            if (index<1000 && index>=100) str="000"+index;
            if (index<10000 && index>=1000) str="00"+index;
            if (index<100000 && index>=10000) str="0"+index;
            if (index<1000000 && index>=100000) str=""+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param year
     * @return
     */
    public static String getCode3(List list, int year){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=year+"00"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=year+"00"+index;
            if (index<100 && index>=10) str=year+"0"+index;
            if (index<1000 && index>=100) str=year+""+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param year
     * @return
     */
    public static String getCode4(List list, int year){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=year+"000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=year+"000"+index;
            if (index<100 && index>=10) str=year+"00"+index;
            if (index<1000 && index>=100) str=year+"0"+index;
            if (index<10000 && index>=1000) str=year+""+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param year
     * @return
     */
    public static String getCode6(List list, int year){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=year+"00000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=year+"00000"+index;
            if (index<100 && index>=10) str=year+"0000"+index;
            if (index<1000 && index>=100) str=year+"000"+index;
            if (index<10000 && index>=1000) str=year+"00"+index;
            if (index<100000 && index>=10000) str=year+"0"+index;
            if (index<1000000 && index>=100000) str=year+""+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param ch
     * @return
     */
    public static String getCode3(List list, String ch){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=ch+"00"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=ch+"00"+index;
            if (index<100 && index>=10) str=ch+"0"+index;
            if (index<1000 && index>=100) str=ch+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param ch
     * @return
     */
    public static String getCode4(List list, String ch){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=ch+"000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=ch+"000"+index;
            if (index<100 && index>=10) str=ch+"00"+index;
            if (index<1000 && index>=100) str=ch+"0"+index;
            if (index<10000 && index>=1000) str=ch+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param ch
     * @return
     */
    public static String getCode6(List list, String ch){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=ch+"00000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=ch+"00000"+index;
            if (index<100 && index>=10) str=ch+"0000"+index;
            if (index<1000 && index>=100) str=ch+"000"+index;
            if (index<10000 && index>=1000) str=ch+"00"+index;
            if (index<100000 && index>=10000) str=ch+"0"+index;
            if (index<1000000 && index>=100000) str=ch+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param ch
     * @param year
     * @return
     */
    public static String getCode3(List list, String ch, int year){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=ch+year+"00"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=ch+year+"00"+index;
            if (index<100 && index>=10) str=ch+year+"0"+index;
            if (index<1000 && index>=100) str=ch+year+""+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param ch
     * @param year
     * @return
     */
    public static String getCode4(List list, String ch, int year){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=ch+year+"000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=ch+year+"000"+index;
            if (index<100 && index>=10) str=ch+year+"00"+index;
            if (index<1000 && index>=100) str=ch+year+"0"+index;
            if (index<10000 && index>=1000) str=ch+year+""+index;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @param ch
     * @param year
     * @return
     */
    public static String getCode6(List list, String ch, int year){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str=ch+year+"00000"+index;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str=ch+year+"00000"+index;
            if (index<100 && index>=10) str=ch+year+"0000"+index;
            if (index<1000 && index>=100) str=ch+year+"000"+index;
            if (index<10000 && index>=1000) str=ch+year+"00"+index;
            if (index<100000 && index>=10000) str=ch+year+"0"+index;
            if (index<1000000 && index>=100000) str=ch+year+""+index;
            return str.toUpperCase();
        }
    }
    /**
     *
     * @param list
     * @param year
     * @return
     */
    public static String getCode(List list, int year){
        String str="";
        if (list.isEmpty()) {
            index=1;
            str="000"+index+"/"+year;
            return str.toUpperCase();
        } else {
            index=list.size()+1;
            if (index<10) str="000"+index+"/"+year;
            if (index<100 && index>=10) str="00"+index+"/"+year;
            if (index<1000 && index>=100) str="0"+index+"/"+year;
            if (index<10000 && index>=1000) str=""+index+"/"+year;
            return str.toUpperCase();
        }
    }
    
    /**
     *
     * @param list
     * @return
     */
//    public static DefaultComboBoxModel<String> comboBoxModel(ArrayList<Dossier> list){
//        DefaultComboBoxModel<String> comboBoxmodel = new DefaultComboBoxModel<>();
//        for (int i = 0; i < list.size(); i++) {
//            comboBoxmodel.addElement(list.get(i).getCintitule_dossier());
//        }
//        return comboBoxmodel;
//    }
    
    /**
     *
     * @param list
     * @return
     */
//    public static DefaultListModel<String> listModel(ArrayList<Dossier> list){
//        DefaultListModel<String> listmodel = new DefaultListModel<>();
//        String s=list.get(list.indexOf("")).getCcode_dossier();
//        for (int i = 0; i < list.size(); i++) {
//            listmodel.addElement(list.get(i).getCintitule_dossier());
//        }
//        return listmodel;
//    }
    
}
