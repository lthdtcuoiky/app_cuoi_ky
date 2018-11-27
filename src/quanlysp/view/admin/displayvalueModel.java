/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

/**
 *
 * @author huy
 */
public class displayvalueModel {
    public  Object displayMember;
    public  Object displayvalue;
 public displayvalueModel() {
   
    }
    public displayvalueModel(Object displayMember, Object displayvalue) {
        this.displayMember = displayMember;
        this.displayvalue = displayvalue;
    }
    @Override
    public String toString(){
        String displayMember = null;
        try {
          displayMember = this.displayMember.toString();
        }catch (Exception e){
            System.out.println("lỗi click");
            e.printStackTrace();
        }
        return displayMember;
    }

}
