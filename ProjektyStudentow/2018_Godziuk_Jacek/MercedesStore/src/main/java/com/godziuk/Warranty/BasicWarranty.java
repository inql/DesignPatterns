/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.godziuk.Warranty;

/**
 *
 * @author jgodziuk
 */
public class BasicWarranty implements Warranty {

    @Override
    public String create() {
        return "2 years of basic warranty";
    }
    
}
