/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventarioAPP.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author alejo
 */
@Table ("productos")
public class Producto {
    @Id
    @Column("codigo")
    private Integer codigo;
    @Column("nombre")
    private String nombre;
    @Column("precio")
    private Double precio;
    @Column("inventario")
    private Integer inventario;

    public Producto(Integer codigo, String nombre, Double precio, Integer inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public Producto(String nombre, Double precio, Integer inventario) {
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public Producto() {
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getInventario() {
        return inventario;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", inventario=" + inventario + '}';
    }
    
    
}
