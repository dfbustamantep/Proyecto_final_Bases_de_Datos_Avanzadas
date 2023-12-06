/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author Josed
 */
public class Consultar {
    DefaultTableModel modelo = new DefaultTableModel();
    String var1,var2,var3,var4,var5,var6,var7,var8,var9,var10;
    
    
    public DefaultTableModel consultar (String sql){
        Conexion con = new Conexion();
        


        try {
            Statement sen = con.getCon().createStatement();
            ResultSet resultado = sen.executeQuery(sql);
            ResultSetMetaData campos = resultado.getMetaData();
            int cantidadColumnas = campos.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(campos.getColumnLabel(i));
            }
            while (resultado.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

            resultado.close();
            con.getCon().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }

        return modelo;
    
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getVar3() {
        return var3;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }

    public String getVar4() {
        return var4;
    }

    public void setVar4(String var4) {
        this.var4 = var4;
    }

    public String getVar5() {
        return var5;
    }

    public void setVar5(String var5) {
        this.var5 = var5;
    }

    public String getVar6() {
        return var6;
    }

    public void setVar6(String var6) {
        this.var6 = var6;
    }

    public String getVar7() {
        return var7;
    }

    public void setVar7(String var7) {
        this.var7 = var7;
    }

    public String getVar8() {
        return var8;
    }

    public void setVar8(String var8) {
        this.var8 = var8;
    }

    public String getVar9() {
        return var9;
    }

    public void setVar9(String var9) {
        this.var9 = var9;
    }

    public String getVar10() {
        return var10;
    }

    public void setVar10(String var10) {
        this.var10 = var10;
    }
    
    
    
    
}
